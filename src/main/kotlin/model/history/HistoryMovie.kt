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

package app.ather.radarr.model.history

import app.ather.radarr.model.Movie
import app.ather.radarr.model.quality.BaseQuality
import java.time.Instant

data class HistoryMovie(
        val id: Int,
        val movieId: Int,
        val movie: Movie,
        val sourceTitle: String,
        val eventType: HistoryEvent,
        val date: Instant,
        val downloadId: String?,
        val qualityCutoffNotMet: Boolean,
        val data: Map<String, String>, // TODO Consider an object here
        val quality: BaseQuality
)