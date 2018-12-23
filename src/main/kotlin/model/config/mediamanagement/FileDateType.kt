package app.ather.radarr.model.config.management

import com.squareup.moshi.Json

enum class FileDateType {
    @Json(name = "none")
    None,
    @Json(name = "cinemas")
    Cinemas,
    @Json(name = "release")
    Release
}