package model.config.netimport

import app.ather.radarr.model.config.netimport.CleanLibraryLevel

data class NetImportConfig(
        var netImportSyncInterval: Int,
        var listSyncLevel: CleanLibraryLevel,
        var importExclusions: String,
        var traktAuthToken: String,
        var traktRefreshToken: String,
        var traktTokenExpiry: Int,
        var id: Int
)