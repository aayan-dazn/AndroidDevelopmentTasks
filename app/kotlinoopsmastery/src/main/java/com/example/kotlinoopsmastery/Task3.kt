package com.example.kotlinoopsmastery

fun main() {
    val numbers  = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

//    val evenNum = numbers.filter { it%2==0 }
    val evenNum = numbers.filter { num -> (num%2 == 0) } //High-Order function - filter() as it takes lambda function as a parameter

    println("Even Numbers: $evenNum")

    val months = listOf("January", "February", "March", "April")

    val selectedMonth = months.filter { month -> month == "February" }

    println("Selected Month : $selectedMonth")

}



