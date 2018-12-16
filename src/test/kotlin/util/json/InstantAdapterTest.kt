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

import app.ather.radarr.util.json.InstantAdapter
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.Instant

internal class InstantAdapterTest {
    private val sut = InstantAdapter

    @Test
    fun `GIVEN instant string WHEN parsed THEN verify correct`() {
        val testInstantStr = "\"2018-12-25T00:00:00Z\""
        val instant = sut.fromJson(testInstantStr)

        assertNotNull(instant)
        assertEquals(1545696000, instant!!.epochSecond)
    }

    @Test
    fun `GIVEN instant object WHEN converted to JSON THEN verify string`() {
        val testInstant = Instant.ofEpochMilli(1245696000000)
        val instantString = sut.toJson(testInstant)

        assertNotNull(instantString)
        assertEquals("\"2009-06-22T18:40:00Z\"", instantString)
    }
}