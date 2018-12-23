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

import app.ather.radarr.model.commands.*
import app.ather.radarr.model.commands.base.Command
import app.ather.radarr.model.commands.enums.DownloadImportMode
import app.ather.radarr.model.commands.params.FilterMovieStatus
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RadarrCommands {
    @GET("command")
    fun get(): Call<List<Command>>

    @GET("command/{id}")
    operator fun get(@Path("id") id: Int): Call<Command>

    @POST("command")
    fun refreshMovie(@Body refreshMovie: RefreshMovie): Call<NewCommandResponse<RefreshMovie>>

    @POST("command")
    fun rescanMovie(@Body rescanMovie: RescanMovie): Call<NewCommandResponse<RescanMovie>>

    @POST("command")
    fun moviesSearch(@Body moviesSearch: MoviesSearch): Call<NewCommandResponse<MoviesSearch>>

    @POST("command")
    fun downloadedMoviesScan(@Body downloadedMoviesScan: DownloadedMoviesScan): Call<NewCommandResponse<DownloadedMoviesScan>>

    @POST("command")
    fun rssSync(@Body rssSync: RssSync): Call<NewCommandResponse<RssSync>>

    @POST("command")
    fun renameFiles(@Body renameFiles: RenameFiles): Call<NewCommandResponse<RenameFiles>>

    @POST("command")
    fun renameMovies(@Body renameMovies: RenameMovies): Call<NewCommandResponse<RenameMovies>>

    @POST("command")
    fun cutOffUnmetMoviesSearch(@Body cutOffUnmetMoviesSearch: CutOffUnmetMoviesSearch): Call<NewCommandResponse<CutOffUnmetMoviesSearch>>

    @POST("command")
    fun netImportSync(@Body netImportSync: NetImportSync): Call<NewCommandResponse<NetImportSync>>

    @POST("command")
    fun missingMoviesSearch(@Body missingMoviesSearch: MissingMoviesSearch): Call<NewCommandResponse<MissingMoviesSearch>>
}

fun RadarrCommands.refreshMovie(movieId: Int? = null) = refreshMovie(RefreshMovie(movieId))
fun RadarrCommands.rescanMovie(movieId: Int? = null) = rescanMovie(RescanMovie(movieId))
fun RadarrCommands.moviesSearch(vararg movieIds: Int) = moviesSearch(MoviesSearch(movieIds.asList()))
fun RadarrCommands.downloadedMoviesScan(path: String? = null, downloadClientId: String? = null, importMode: DownloadImportMode? = null) = downloadedMoviesScan(DownloadedMoviesScan(path, downloadClientId, importMode))
fun RadarrCommands.rssSync() = rssSync(RssSync())
fun RadarrCommands.renameFiles(vararg fileIds: Int) = renameFiles(RenameFiles(fileIds.asList()))
fun RadarrCommands.renameMovies(vararg movieIds: Int) = renameMovies(RenameMovies(movieIds.asList()))

fun RadarrCommands.cutOffUnmetMoviesSearchMonitored(monitored: Boolean = true) = cutOffUnmetMoviesSearch(CutOffUnmetMoviesSearch.filterMonitored(monitored))
fun RadarrCommands.cutOffUnmetMoviesSearchAll() = cutOffUnmetMoviesSearch(CutOffUnmetMoviesSearch.filterAll())
fun RadarrCommands.cutOffUnmetMoviesSearchStatus(status: FilterMovieStatus) = cutOffUnmetMoviesSearch(CutOffUnmetMoviesSearch.filterStatus(status))

fun RadarrCommands.netImportSync() = netImportSync(NetImportSync())

fun RadarrCommands.missingMoviesSearchMonitored(monitored: Boolean = true) = missingMoviesSearch(MissingMoviesSearch.filterMonitored(monitored))
fun RadarrCommands.missingMoviesSearchAll() = missingMoviesSearch(MissingMoviesSearch.filterAll())
fun RadarrCommands.missingMoviesSearchStatus(status: FilterMovieStatus) = missingMoviesSearch(MissingMoviesSearch.filterStatus(status))