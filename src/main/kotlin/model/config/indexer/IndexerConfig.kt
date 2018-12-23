package app.ather.radarr.model.config.indexer

data class IndexerConfig(
        var minimumAge: Int,
        var maximumSize: Int,
        var retention: Int,
        var rssSyncInterval: Int,
        var preferIndexerFlags: Boolean,
        var availabilityDelay: Int,
        var allowHardcodedSubs: Boolean,
        var whitelistedHardcodedSubs: String,
        var parsingLeniency: ParsingLeniencyType
)