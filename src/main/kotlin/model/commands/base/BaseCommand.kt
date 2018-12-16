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

package app.ather.radarr.model.commands.base

import app.ather.radarr.model.commands.enums.CommandName
import app.ather.radarr.model.commands.enums.CommandState
import java.time.Instant

internal interface BaseCommand {
    var name: CommandName
    var startedOn: Instant
    var sendUpdatesToClient: Boolean
    var state: CommandState
    var id: Int
}