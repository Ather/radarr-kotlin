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

package app.ather.radarr.model.system

import app.ather.radarr.model.authentication.AuthenticationType
import java.time.Instant

data class SystemStatus(
        val appData: String,
        val authentication: AuthenticationType,
        val branch: String,
        val buildTime: Instant,
        val isAdmin: Boolean,
        val isDebug: Boolean,
        val isLinux: Boolean,
        val isMono: Boolean,
        val isMonoRuntime: Boolean,
        val isOsx: Boolean,
        val isProduction: Boolean,
        val isUserInteractive: Boolean,
        val isWindows: Boolean,
        val osVersion: String,
        val runtimeVersion: String,
        val sqliteVersion: String,
        val startupPath: String,
        val urlBase: String,
        val version: String
)