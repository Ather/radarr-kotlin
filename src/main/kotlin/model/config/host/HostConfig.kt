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