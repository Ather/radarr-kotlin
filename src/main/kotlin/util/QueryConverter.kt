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

package app.ather.radarr.util

import com.squareup.moshi.Json
import retrofit2.Converter
import retrofit2.Retrofit
import java.lang.reflect.Type

object QueryConverter: Converter.Factory() {
    override fun stringConverter(type: Type, annotations: Array<Annotation>, retrofit: Retrofit): Converter<*, String>? {
        var converter: Converter<*, String>? = null
        if (type is Class<*> && type.isEnum) {
            converter = Converter<Enum<*>, String> {
                val field = it.javaClass.getField(it.name)
                field.getAnnotation(Query::class.java)?.name ?: field.getAnnotation(Json::class.java)?.name ?: it.name
            }
        }
        return converter
    }
}