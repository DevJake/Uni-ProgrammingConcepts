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

object BoundedIteration {
    fun example1Type1() {
        val n = 10
        var SUM = 0

        for (i in 1..n) {
            SUM = SUM + i
        }
    }

    fun example1Type2() {
        val n = 10
        var SUM = 0

        for (i in n downTo 1) {
            //Using an infix method to decrementally iterate through the values
            SUM = SUM + i
        }
    }

    fun example1Implementation1(n: Int) = (1..n).sum()
}