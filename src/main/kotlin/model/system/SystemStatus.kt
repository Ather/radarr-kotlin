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