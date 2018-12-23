package app.ather.radarr.services

import app.ather.radarr.model.config.UIConfig
import app.ather.radarr.model.config.indexer.IndexerConfig
import app.ather.radarr.model.config.host.HostConfig
import app.ather.radarr.model.config.mediamanagement.MediaManagementConfig
import app.ather.radarr.model.config.naming.NamingConfig
import app.ather.radarr.model.config.netimport.NetImportConfig
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

    @get:GET("config/mediamanagement")
    val mediaManagement: Call<MediaManagementConfig>

    @POST("config/mediamanagement")
    fun mediaManagement(@Body config: MediaManagementConfig): Call<MediaManagementConfig>

    @get:GET("config/naming")
    val naming: Call<NamingConfig>

    @POST("config/naming")
    fun naming(@Body config: NamingConfig): Call<NamingConfig>

    @get:GET("config/netimport")
    val netImport: Call<NetImportConfig>

    @POST("config/netimport")
    fun netImport(@Body config: NetImportConfig): Call<NetImportConfig>

    @get:GET("config/ui")
    val ui: Call<UIConfig>

    @POST("config/ui")
    fun ui(@Body config: UIConfig): Call<UIConfig>
}