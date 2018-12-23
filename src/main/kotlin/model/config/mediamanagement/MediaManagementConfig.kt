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