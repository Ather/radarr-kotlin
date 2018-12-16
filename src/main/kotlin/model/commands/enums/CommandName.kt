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

package app.ather.radarr.model.commands.enums

import com.squareup.moshi.Json

enum class CommandName {
    @Json(name = "refreshMovie")
    RefreshMovie,
    @Json(name = "rescanMovie")
    RescanMovie,
    @Json(name = "moviesSearch")
    MoviesSearch,
    @Json(name = "downloadedMoviesScan")
    DownloadedMoviesScan,
    @Json(name = "rssSync")
    RssSync,
    @Json(name = "renameFiles")
    RenameFiles,
    @Json(name = "renameMovies")
    RenameMovies,
    @Json(name = "cutOffUnmetMoviesSearch")
    CutOffUnmetMoviesSearch,
    @Json(name = "netImportSync")
    NetImportSync,
    @Json(name = "missingMoviesSearch")
    MissingMoviesSearch
}