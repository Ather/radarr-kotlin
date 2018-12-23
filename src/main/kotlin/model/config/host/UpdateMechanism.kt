package model.config.host

import com.squareup.moshi.Json

enum class UpdateMechanism {
    @Json(name = "builtIn")
    BuiltIn,
    @Json(name = "script")
    Script
}