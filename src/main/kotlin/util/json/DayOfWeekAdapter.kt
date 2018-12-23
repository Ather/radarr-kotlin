package app.ather.radarr.util.json

import com.squareup.moshi.*
import java.time.DayOfWeek

object DayOfWeekAdapter : JsonAdapter<DayOfWeek>() {
    @FromJson
    override fun fromJson(reader: JsonReader): DayOfWeek = DayOfWeek.of(reader.nextInt())

    @ToJson
    override fun toJson(writer: JsonWriter, value: DayOfWeek?) {
        writer.value(value?.value)
    }
}