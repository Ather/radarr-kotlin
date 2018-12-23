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

package app.ather.radarr.model.language

import com.squareup.moshi.Json

enum class Language {
    @Json(name = "unknown")
    Unknown,
    @Json(name = "english")
    English,
    @Json(name = "french")
    French,
    @Json(name = "spanish")
    Spanish,
    @Json(name = "german")
    German,
    @Json(name = "italian")
    Italian,
    @Json(name = "danish")
    Danish,
    @Json(name = "dutch")
    Dutch,
    @Json(name = "japanese")
    Japanese,
    @Json(name = "cantonese")
    Cantonese,
    @Json(name = "mandarin")
    Mandarin,
    @Json(name = "russian")
    Russian,
    @Json(name = "polish")
    Polish,
    @Json(name = "vietnamese")
    Vietnamese,
    @Json(name = "swedish")
    Swedish,
    @Json(name = "norwegian")
    Norwegian,
    @Json(name = "finnish")
    Finnish,
    @Json(name = "turkish")
    Turkish,
    @Json(name = "portuguese")
    Portuguese,
    @Json(name = "flemish")
    Flemish,
    @Json(name = "greek")
    Greek,
    @Json(name = "korean")
    Korean,
    @Json(name = "hungarian")
    Hungarian,
    @Json(name = "hebrew")
    Hebrew,
    @Json(name = "czech")
    Czech,
    @Json(name = "any")
    Any
}