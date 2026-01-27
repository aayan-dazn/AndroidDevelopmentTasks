package com.example.androiddevelopmenttasks.screen

sealed class Screen(val route:String){
    object Home: Screen("home")
    object Task1: Screen("task1")
    object Task2: Screen("task2")
}