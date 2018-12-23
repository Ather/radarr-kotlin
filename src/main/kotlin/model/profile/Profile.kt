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

package app.ather.radarr.model.profile

import app.ather.radarr.model.language.Language
import app.ather.radarr.model.quality.Quality

data class Profile(
        var name: String,
        var cutoff: Quality,
        var preferredTags: String,
        var items: List<ProfileQualityItem>,
        var formatCutoff: CustomFormat,
        var formatItems: List<ProfileFormatItem>,
        var language: Language,
        var id: Int? = null
)