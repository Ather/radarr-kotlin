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

package util.json

import app.ather.radarr.util.json.DurationAdapter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import java.time.Duration

internal class DurationAdapterTest {
    private val sut = DurationAdapter

    @Test
    fun `GIVEN duration string WHEN parsed THEN verify result`() {
        val testDurString = "\"20:30:10\""
        val duration = sut.fromJson(testDurString)

        assertNotNull(duration)
        assertEquals(73810, duration!!.toSeconds())
    }

    @Test
    fun `GIVEN duration object WHEN converted to JSON THEN verify output`() {
        val testDur = Duration.ofHours(3)
        val durJson = sut.toJson(testDur)

        assertNotNull(durJson)
        assertEquals("\"03:00:00\"", durJson)
    }

    @Test
    fun `GIVEN hundred hour duration object WHEN converted to JSON THEN verify output`() {
        val testDur = Duration.ofSeconds(722735)
        val durJson = sut.toJson(testDur)

        assertNotNull(durJson)
        assertEquals("\"200:45:35\"", durJson)
    }
}