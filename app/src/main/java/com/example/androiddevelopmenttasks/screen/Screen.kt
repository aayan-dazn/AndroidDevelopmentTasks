package com.example.androiddevelopmenttasks.screen

sealed class Screen(val route:String){
    object Home: Screen("home")
    object Task1: Screen("task1")
    object Task2: Screen("task2")
    object Task3: Screen("task3")
    object Task4: Screen("task4")
    object Task5: Screen("task5")
    object Task6: Screen("task6")

}