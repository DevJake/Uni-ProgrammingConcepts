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

object ConditionalIteration {
    fun example1() {
        var n = 10
        var SUM = 0
        var ITER = 1

        while (ITER <= n) {
            SUM = SUM + ITER
            ITER = ITER + 1
        }
    }

    fun example1Implementation1(n: Int): Int {
        var iter = 0
        var sum = 0
        while (iter <= n) {
            sum += iter
            iter += 1
        }

        return sum
    }
}