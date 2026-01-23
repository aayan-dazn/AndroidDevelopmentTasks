package com.example.kotlinoopsmastery

fun main(){
    print("Enter the number of subject: ")
    val subjectCount = readLine()?.toIntOrNull()?:return

    var totalPoints = 0.0

    for(i in 1..subjectCount){
        print("Enter marks of subject $i (0-100): ")
        val marks = readLine()?.toIntOrNull()?:0
        val gradePoint = getGradePoint(marks)
        totalPoints += gradePoint
    }
    val gpa = totalPoints/subjectCount
    println("Your Grade is: $gpa")
}


fun getGradePoint(marks:Int):Double{
    return when{
        marks >= 90 -> 10.0
        marks >= 80 -> 9.0
        marks >= 70 -> 8.0
        marks >= 60 -> 7.0
        marks >= 50 -> 6.0
        else -> 0.0
    }
}