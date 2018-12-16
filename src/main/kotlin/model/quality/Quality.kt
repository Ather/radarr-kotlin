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

package model.quality

import app.ather.radarr.model.quality.Modifier
import app.ather.radarr.model.quality.Resolution
import app.ather.radarr.model.quality.Source

data class Quality(
        val id: Int,
        var modifier: Modifier,
        var name: String,
        var resolution: Resolution,
        var source: Source
)