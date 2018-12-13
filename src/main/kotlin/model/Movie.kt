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

package app.ather.radarr.model

import java.time.Instant

data class Movie(
        var title: String,
        var sortTitle: String,
        var sizeOnDisk: Long,
        var status: MovieStatus,
        var overview: String,
        var inCinemas: Instant,
        var images: List<MediaCover>,
        var website: String?,
        var downloaded: Boolean,
        var year: Int,
        var hasFile: Boolean,
        var youtubeTrailerId: String?,
        var studio: String,
        var path: String,
        var profileId: Int,
        var monitored: Boolean,
        var minimumAvailability: MovieStatus,
        var runtime: Int,
        var lastInfoSync: Instant,
        var cleanTitle: String,
        var imdbId: String,
        var tmdbId: Int,
        var titleSlug: String,
        var genres: List<String>,
        var tags: List<String>,
        var added: Instant,
        var ratings: MovieRatings,
        var alternativeTitles: MutableList<AlternateTitle>,
        var qualityProfileId: Int,
        var id: Int
)