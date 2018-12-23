package app.ather.radarr.services

import app.ather.radarr.model.config.indexer.IndexerConfig
import app.ather.radarr.model.config.host.HostConfig
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RadarrConfig {
    @get:GET("config/host")
    val host: Call<HostConfig>

    @POST("config/host")
    fun host(@Body config: HostConfig): Call<HostConfig>

    @get:GET("config/indexer")
    val indexer: Call<IndexerConfig>

    @POST("config/indexer")
    fun indexer(@Body config: IndexerConfig): Call<IndexerConfig>
}