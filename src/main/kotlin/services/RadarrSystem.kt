package app.ather.radarr.services

import app.ather.radarr.model.system.SystemStatus
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface RadarrSystem {
    @get:GET("system/status")
    val status: Call<SystemStatus>

    @get:POST("system/shutdown")
    val shutdown: Call<Unit>

    @get:POST("system/restart")
    val restart: Call<Unit>
}