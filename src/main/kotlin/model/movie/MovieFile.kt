/*
 * Copyright 2019 Michael Haas
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

import app.ather.radarr.model.quality.Quality
import app.ather.radarr.model.quality.Revision
import java.time.Instant

data class MovieFile(
        val dateAdded: Instant,
        val edition: String,
        val id: Int,
        val mediaInfo: Any,
        val quality: Quality,
        val revision: Revision,
        val relativePath: String,
        val size: Long
)