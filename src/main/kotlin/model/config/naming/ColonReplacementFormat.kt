package app.ather.radarr.model.config.naming

import com.squareup.moshi.Json

enum class ColonReplacementFormat {
    @Json(name = "delete")
    Delete,
    @Json(name = "dash")
    Dash,
    @Json(name = "spaceDash")
    SpaceDash,
    @Json(name = "spaceDashDash")
    SpaceDashSpace
}