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

package app.ather.radarr.model.config.host

import app.ather.radarr.model.authentication.AuthenticationType

data class HostConfig(
        var bindAddress: String,
        var port: Int,
        var sslPort: Int,
        var enableSsl: Boolean,
        var launchBrowser: Boolean,
        var authenticationMethod: AuthenticationType,
        var analyticsEnabled: Boolean,
        var username: String,
        var password: String,
        var logLevel: String,
        var branch: String,
        var apiKey: String,
        var sslCertHash: String,
        var urlBase: String,
        var updateAutomatically: Boolean,
        var updateMechanism: UpdateMechanism,
        var updateScriptPath: String,
        var proxyEnabled: Boolean,
        var proxyType: ProxyType,
        var proxyHostname: String,
        var proxyPort: Int,
        var proxyUsername: String,
        var proxyPassword: String,
        var proxyBypassFilter: String,
        var proxyBypassLocalAddresses: Boolean
)