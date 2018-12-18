package app.ather.radarr.services

import app.ather.radarr.model.Movie
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