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

package app.ather.radarr.services

import app.ather.radarr.model.movie.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RadarrLookup {
    @GET("movie/lookup")
    fun term(@Query("term") term: String): Call<List<Movie>>

    @GET("movie/lookup/tmdb")
    fun tmdb(@Query("tmdbId") tmdbId: Int): Call<List<Movie>>

    @GET("movie/lookup/imdb")
    fun imdb(@Query("imdbId") imdbId: String): Call<List<Movie>>
}

operator fun RadarrLookup.get(term: String) = term(term)

enum class LookupKey {
    Term,
    TMDb,
    IMDb
}

operator fun RadarrLookup.get(key: LookupKey, term: String) = when (key) {
    LookupKey.Term -> term(term)
    LookupKey.TMDb -> tmdb(term.toInt())
    LookupKey.IMDb -> imdb(term)
}
operator fun RadarrLookup.get(key: LookupKey, id: Int) = when (key) {
    LookupKey.TMDb -> tmdb(id)
    else -> term(id.toString())
}
