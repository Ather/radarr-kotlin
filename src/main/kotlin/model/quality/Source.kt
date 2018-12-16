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

package app.ather.radarr.model.quality

import com.squareup.moshi.Json

enum class Source {
    @Json(name = "unknown") Unknown,
    @Json(name = "cam") Cam,
    @Json(name = "telesync") Telesync,
    @Json(name = "telecine") Telecine,
    @Json(name = "workprint") Workprint,
    @Json(name = "dvd") DVD,
    @Json(name = "tv") TV,
    @Json(name = "webdl") WebDL,
    @Json(name = "bluray") Bluray
}