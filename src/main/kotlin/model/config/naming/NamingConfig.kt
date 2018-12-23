package app.ather.radarr.model.config.naming

data class NamingConfig(
        var renameEpisodes: Boolean,
        var replaceIllegalCharacters: Boolean,
        var colonReplacementFormat: ColonReplacementFormat,
        var standardMovieFormat: String,
        var movieFolderFormat: String,
        var multiEpisodeStyle: Int,
        var includeSeriesTitle: Boolean,
        var includeEpisodeTitle: Boolean,
        var includeQuality: Boolean,
        var replaceSpaces: Boolean,
        var id: Int
)