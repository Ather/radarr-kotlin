package app.ather.radarr.model.config.host

import com.squareup.moshi.Json

enum class ProxyType {
    @Json(name = "http")
    Http,
    @Json(name = "socks4")
    Socks4,
    @Json(name = "socks5")
    Socks5
}