/*
 * Copyright 2017 Jake Dean
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

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        /*
        Init code for Kotlin implementations and examples
         */
        DirectSequencing.example1()
        DirectSequencing.example1Implementation1(2, 6)
        DirectSequencing.example2()
        DirectSequencing.example2Implementation1(1, 3, arrayOf(3, 2, 1, 4, 5, 6))

        BoundedIteration.example1Type1()
        BoundedIteration.example1Type2()
        BoundedIteration.example1Implementation1(12)

        ConditionalIteration.example1()
        ConditionalIteration.example1Implementation1(14)


        /*
        Init code for Java implementations and examples
         */
        DirectSequencingJava.example1()
        DirectSequencingJava.example1Implementation1(2, 6)
        DirectSequencingJava.example2()
        DirectSequencingJava.example2Implementation1(1, 3, arrayOf(3, 2, 1, 4, 5, 6))

        BoundedIterationJava.example1Type1()
        BoundedIterationJava.example1Type2()
        BoundedIterationJava.example1Implementation1(12)

        ConditionalIterationJava.example1()
        ConditionalIterationJava.example1Implementation1(14)
    }
}