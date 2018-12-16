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

import app.ather.radarr.model.commands.NewCommandResponse
import app.ather.radarr.model.commands.base.BaseNewCommand
import app.ather.radarr.model.commands.base.Command
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RadarrCommands {
    @GET("command")
    operator fun invoke(): Call<List<Command>>
    @GET("command")
    fun get(): Call<List<Command>>

    @GET("command/{id}")
    operator fun get(@Path("id") id: Int): Call<Command>

    @POST("command")
    fun <T : BaseNewCommand> insert(command: T): Call<NewCommandResponse<T>>
    @POST("command")
    operator fun <T : BaseNewCommand> plus(command: T): Call<NewCommandResponse<T>>
}