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
 *  limitations under the License.
 */

public class BoundedIterationJava {
    public static void example1Type1() {
        int n = 10;
        int SUM = 0;
        for (int i = 0; i <= n; i = i + 1) {
            SUM = SUM + i;
        }
    }
    
    public static void example1Type2() {
        int n = 10;
        int SUM = 0;
        for (int i = n; i > 0; i = i - 1) {
            SUM = SUM + i;
        }
    }
    
    public static int example1Implementation1(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += i;
        return sum;
    }
}
