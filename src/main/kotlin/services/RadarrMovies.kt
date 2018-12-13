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

import app.ather.radarr.model.Movie
import app.ather.radarr.model.NewMovie
import kotlinx.coroutines.Deferred
import retrofit2.http.*

interface RadarrMovies {
    @GET("movie")
    operator fun invoke(): Deferred<List<Movie>>
    @GET("movie")
    fun get(): Deferred<List<Movie>>

    @GET("movie/{id}")
    operator fun get(@Path("id") id: Int): Deferred<Movie>

    @POST("movie")
    fun insert(movie: NewMovie): Deferred<Movie>
    @POST("movie")
    operator fun plus(movie: NewMovie): Deferred<Movie>

    @PUT("movie")
    fun update(movie: Movie): Deferred<Movie>

    @DELETE("movie/{id}")
    fun delete(@Path("id") id: Int, @Query("deleteFiles") deleteFiles: Boolean = false): Deferred<Unit>
}