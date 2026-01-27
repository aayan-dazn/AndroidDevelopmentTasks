package com.example.androiddevelopmenttasks.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_compose_mastery.Task1
import com.example.jetpack_compose_mastery.Task2

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
        }
    }
}