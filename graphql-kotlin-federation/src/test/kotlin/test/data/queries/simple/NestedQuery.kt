/*
 * Copyright 2019 Expedia, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.data.queries.simple

import kotlin.random.Random

class NestedQuery {
    fun getSimpleNestedObject(): List<SelfReferenceObject?> = listOf(SelfReferenceObject())
}

class SelfReferenceObject {
    val description: String? = "SelfReferenceObject"
    val id = Random.nextInt()
    fun nextObject(): List<SelfReferenceObject?> = listOf(SelfReferenceObject())
}