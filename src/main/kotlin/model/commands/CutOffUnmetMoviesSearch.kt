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

package app.ather.radarr.model.commands

import app.ather.radarr.model.commands.base.BaseNewCommand
import app.ather.radarr.model.commands.enums.CommandName
import app.ather.radarr.model.commands.params.FilterMovieStatus
import app.ather.radarr.model.commands.params.SearchKey

data class CutOffUnmetMoviesSearch internal constructor(
        val filterKey: SearchKey,
        val filterValue: Any
) : BaseNewCommand {
    override val name: CommandName = CommandName.CutOffUnmetMoviesSearch

    companion object {
        fun filterMonitored(value: Boolean = true) = CutOffUnmetMoviesSearch(SearchKey.Monitored, value.toString())
        fun filterAll() = CutOffUnmetMoviesSearch(SearchKey.All, "all")
        fun filterStatus(status: FilterMovieStatus) = CutOffUnmetMoviesSearch(SearchKey.Status, status)
    }
}