/*
 * Copyright 2018 Michael Haas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.ather.radarr

import app.ather.radarr.auth.RadarrAuthenticator
import app.ather.radarr.services.RadarrMovies
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class Radarr(
        radarrHost: String = "localhost:7878",
        internal val apiKey: String,
        useSsl: Boolean = false
) {
    private val apiUrl = "${if (useSsl) "https://" else "http://"}$radarrHost/api/"

    private val okHttpClient by lazy {
        OkHttpClient.Builder().authenticator(RadarrAuthenticator(this)).build()
    }

    private val retrofit by lazy {
        Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .client(okHttpClient)
                .build()
    }

    private val movies by lazy { retrofit.create(RadarrMovies::class.java) }
}