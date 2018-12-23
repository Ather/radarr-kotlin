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

package app.ather.radarr.model.movie

data class NewMovie(
        var title: String,
        var qualityProfileId: Int,
        var titleSlug: String,
        var images: List<MediaCover>,
        var tmdbId: Int,
        var year: Int,
        var path: String?,
        var rootFolderPath: String?,
        var monitored: Boolean? = null,
        var addOptions: Map<String, Any>? = null
) {
    constructor(movie: Movie) : this(movie.title, movie.qualityProfileId, movie.titleSlug, movie.images, movie.tmdbId, movie.year, movie.path, null, movie.monitored)
}