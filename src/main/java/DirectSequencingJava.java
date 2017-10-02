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

public class DirectSequencingJava {
    public static int example1() {
        int CURR = 1;
        int LAST = 10;
        int MIDDLE = (CURR + LAST) / 2;
        return MIDDLE;
    }
    
    public static int example1Implementation1(int curr, int last) {
        return (curr + last) / 2;
    }
    
    public static void example2() {
        //This is purely to avoid compiler errors in the demonstration
        int i = 0;
        int j = 1;
        Integer[] A = new Integer[]{4, 5};
        int TEMP = A[i];
        A[i] = A[j];
        A[j] = TEMP;
    }
    
    public static Integer[] example2Implementation1(int i, int j, Integer[] g) {
        if (i < 0 || j < 0 || i > g.length || j > g.length) return g;
        int temp = g[i];
        g[i] = g[j];
        g[j] = temp;
        return g;
    }
}
