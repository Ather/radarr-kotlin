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
import app.ather.radarr.model.movie.NewMovie
import retrofit2.Call
import retrofit2.http.*

interface RadarrMovies {
    @get:GET("movie")
    val all: Call<List<Movie>>

    @GET("movie/{id}")
    operator fun get(@Path("id") id: Int): Call<Movie>

    @POST("movie")
    fun create(movie: NewMovie): Call<Movie>

    @PUT("movie")
    fun update(movie: Movie): Call<Movie>

    @DELETE("movie/{id}")
    fun delete(@Path("id") id: Int, @Query("deleteFiles") deleteFiles: Boolean = false): Call<Unit>
}