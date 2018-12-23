package app.ather.radarr.model.config.mediamanagement

data class MediaManagementConfig(
        var autoUnmonitorPreviouslyDownloadedEpisodes: Boolean,
        var recycleBin: String,
        var autoDownloadPropers: Boolean,
        var createEmptySeriesFolders: Boolean,
        var fileDate: FileDateType,
        var autoRenameFolders: Boolean,
        var pathsDefaultStatic: Boolean,
        var setPermissionsLinux: Boolean,
        var fileChmod: String,
        var folderChmod: String,
        var chownUser: String,
        var chownGroup: String,
        var skipFreeSpaceCheckWhenImporting: Boolean,
        var copyUsingHardlinks: Boolean,
        var importExtraFiles: Boolean,
        var extraFileExtensions: String,
        var enableMediaInfo: Boolean,
        var id: Int
)