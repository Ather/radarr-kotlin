/*
 * Copyright 2018 Michael Haas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.ather.radarr.util.json

import com.squareup.moshi.*
import java.time.Duration

object DurationAdapter : JsonAdapter<Duration>() {
    @FromJson
    override fun fromJson(reader: JsonReader): Duration? {
        val (hours, minutes, seconds) = reader.nextString().split(":").map { it.toLong() }
        return Duration.ofSeconds(3600 * hours + 60 * minutes + seconds)
    }

    @ToJson
    override fun toJson(writer: JsonWriter, value: Duration?) {
        writer.value(value?.run(this::toHMS))
    }


    private fun toHMS(duration: Duration) = duration.run {
        "${toHours().toPaddedDuration()}:" +
                "${toMinutesPart().toPaddedDuration()}:" +
                toSecondsPart().toPaddedDuration()
    }
    private fun Number.toPaddedDuration() = toString().padStart(2, '0')
}