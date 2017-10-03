/*
 *    Copyright 2017 Jake Dean
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

object aLaRusse : MultAlgo {
    override fun mult(a: Int, b: Int): Int {
        if (a <= 0 || b <= 0) return 0
        var russe = mutableMapOf<Int, Int>()
        russe.put(a, b)
        var i = a
        var j = b
        while (i / 2 > 0) {
            i /= 2
            j *= 2
            russe.put(i, j)
        }

        return russe.filter { entry -> entry.key % 2 != 0 }.values.sum()
    }
}

object highSchoolMult : MultAlgo {
    override fun mult(a: Int, b: Int): Int = a.toString().toCharArray().map { Character.getNumericValue(it) }.reversed().withIndex().map({ (i, p) -> b * (p * Math.pow(10.0, i.toDouble())) }).sum().toInt()
}

interface MultAlgo {
    fun mult(a: Int, b: Int): Int
}