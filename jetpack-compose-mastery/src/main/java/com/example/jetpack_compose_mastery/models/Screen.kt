package com.example.jetpack_compose_mastery.models

sealed class Screen(val route:String){
    object Home: Screen("home")
    object Task1: Screen("task1")
    object Task2: Screen("task2")
    object Task3: Screen("task3")
    object Task4: Screen("task4")
    object Task5: Screen("task5")
    object MovieDetails: Screen("movie_details/{movieId}")
    {
        fun createRoute(movieId:Int): String {
            return "movie_details/$movieId"
        }
    }

    object Task6: Screen("task6")

    object Task7: Screen("task7")

    object Task8: Screen("task8")

}