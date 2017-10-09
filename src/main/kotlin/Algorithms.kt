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


fun conditionalIterationExample1(n: Int): Int {
    var sum = 0
    var iter = 1

    while (iter <= n){
        sum = sum + iter
        iter = iter + 1
    }

    return sum
}

fun conditionalIterationExample2(n: Int): Int {
    var sum = 0
    var iter = 1

    while (iter <= n){
        sum += iter
        iter += 1
    }

    return sum
}

fun salaryBillCalc1(E: Array<Double>){
    var total = 0.0
    var ptr = 1
    while (ptr <= E.size){
        total = total + E[ptr]
        ptr = ptr + 1
    }
}

fun salaryBillCalc2(E: Array<Double>){
    var total = 0.0
    var ptr = 1
    while (ptr <= E.size){
        total += E[ptr]
        ptr += 1
    }
}

fun happyEmployees1(E: Array<Employee>){
    var happy = 0
    E.forEachIndexed { i, employee ->
        var boss = boss(employee)
        var salary = salary(employee)
        var ptr = E.indexOfFirst { it.name == boss }
        if (salary(E[ptr]) < salary)
            happy += 1
    }
}

fun happyEmployees2(E: Array<Employee>) = E.filter { e -> E.first { it.name == e.boss }.salary < e.salary }.size

data class Employee(var name: String, var salary: Double, var boss: String)

private fun name(e: Employee) = e.name
private fun salary(e: Employee) = e.salary
private fun boss(e: Employee) = e.boss