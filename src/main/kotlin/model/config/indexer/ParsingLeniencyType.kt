package app.ather.radarr.model.config.indexer

import com.squareup.moshi.Json

enum class ParsingLeniencyType {
    @Json(name = "strict")
    Strict,
    @Json(name = "parsingLenient")
    ParsingLenient,
    @Json(name = "mappingLenient")
    MappingLenient
}