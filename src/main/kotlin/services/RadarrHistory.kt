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

package app.ather.radarr.services

import app.ather.radarr.model.history.HistoryResponse
import app.ather.radarr.model.history.HistorySortKey
import app.ather.radarr.model.paging.SortDirection
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RadarrHistory {
    @GET("history")
    operator fun get(
            @Query("page") page: Int,
            @Query("pageSize") pageSize: Int? = null,
            @Query("sortKey") sortKey: HistorySortKey? = null,
            @Query("sortDir") sortDir: SortDirection? = null,
            @Query("movieId") movieId: Int? = null
    ): Call<HistoryResponse>
}