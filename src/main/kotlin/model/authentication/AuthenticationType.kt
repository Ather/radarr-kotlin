package app.ather.radarr.model.authentication

import com.squareup.moshi.Json

enum class AuthenticationType {
    @Json(name = "none")
    None,
    @Json(name = "basic")
    Basic,
    @Json(name = "forms")
    Forms
}