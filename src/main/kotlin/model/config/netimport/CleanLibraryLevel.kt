package app.ather.radarr.model.config.netimport

import com.squareup.moshi.Json

enum class CleanLibraryLevel {
    @Json(name = "disabled")
    Disabled,
    @Json(name = "logOnly")
    LogOnly,
    @Json(name = "keepAndUnmonitor")
    KeepAndUnmonitor,
    @Json(name = "removeAndKeep")
    RemoveAndKeep,
    @Json(name = "removeAndDelete")
    RemoveAndDelete
}