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

object DirectSequencing {
    fun example1(): Int {
        var CURR = 1
        var LAST = 10
        var MIDDLE = (CURR + LAST) / 2
        return MIDDLE
    }

    fun example1Implementation1(curr: Int, last: Int) = (curr + last) / 2

    fun example2() {
        //This is purely to avoid compiler errors in the demonstration
        var i = 0
        var j = 1

        var A = arrayOf(4, "five")
        var TEMP = A[i]
        A[i] = A[j]
        A[j] = TEMP
    }

    fun <T> example2Implementation1(i: Int, j: Int, array: Array<T>): Array<T> {
        if (i !in 0..array.size || j !in 0..array.size) return array
        /*
        Ideally, I'd throw an exception, but this is
        for demonstration purposes of validating legal arguments.

        Returning the inputted array is also a valid option.
        */

        var temp = array[i]
        array[i] = array[j]
        array[j] = temp

        return array
    }
}