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

package app.ather.radarr.model.config.indexer

data class IndexerConfig(
        var minimumAge: Int,
        var maximumSize: Int,
        var retention: Int,
        var rssSyncInterval: Int,
        var preferIndexerFlags: Boolean,
        var availabilityDelay: Int,
        var allowHardcodedSubs: Boolean,
        var whitelistedHardcodedSubs: String,
        var parsingLeniency: ParsingLeniencyType
)