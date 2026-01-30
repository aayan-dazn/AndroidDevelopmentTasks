package com.example.androiddevelopmenttasks.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpack_compose_mastery.Task1
import com.example.jetpack_compose_mastery.Task2
import com.example.jetpack_compose_mastery.Task3
import com.example.jetpack_compose_mastery.Task4
import com.example.jetpack_compose_mastery.Task5
import com.example.jetpack_compose_mastery.Task6
import com.example.jetpack_compose_mastery.Task7
import com.example.jetpack_compose_mastery.Task8
import com.example.jetpack_compose_mastery.models.Screen
import com.example.jetpack_compose_mastery.ui.task5_screens.MovieDetails

@Composable
fun Tasks(paddingValues: PaddingValues) {
    val navController = rememberNavController()
    Surface(
        Modifier.padding(paddingValues),
        color = MaterialTheme.colorScheme.background
    ) {
        NavHost(navController, startDestination = Screen.Home.route) {
            composable(route = Screen.Home.route) {
                Home(navController)
            }
            composable(route = Screen.Task1.route) {
                Task1()
            }
            composable(route = Screen.Task2.route) {
                Task2()
            }
            composable(route = Screen.Task3.route) {
                Task3()
            }
            composable(route = Screen.Task4.route) {
                Task4()
            }
            composable(route = Screen.Task5.route) {
                Task5(navController)
            }
            composable(
                route = Screen.MovieDetails.route,
                arguments = listOf(
                    navArgument("movieId"){
                        type = NavType.IntType
                    }
                )
            ){ backStackEntry ->
                val movieId = backStackEntry.arguments?.getInt("movieId")
                MovieDetails(movieId!!,navController)
            }

            composable(route = Screen.Task6.route){
                Task6()
            }

            composable(route = Screen.Task7.route){
                Task7()
            }

            composable(route = Screen.Task8.route){
                Task8()
            }
        }
    }
}