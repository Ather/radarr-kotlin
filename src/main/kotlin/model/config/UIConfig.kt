package app.ather.radarr.model.config

import java.time.DayOfWeek

data class UIConfig(
        var calendarWeekColumnHeader: String,
        var enableColorImpairedMode: Boolean,
        var firstDayOfWeek: DayOfWeek,
        var id: Int,
        var longDateFormat: String,
        var shortDateFormat: String,
        var showRelativeDates: Boolean,
        var timeFormat: String
)