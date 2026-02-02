package com.example.androiddevelopmenttasks.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpack_compose_mastery.models.Screen

@Composable
fun JetPack(navController: NavController) {
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("JetPack Compose Tasks")
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    navController.navigate(Screen.Task1.route)
                }
            ) {
                Text("Task1")
            }

            Button(
                onClick = {
                    navController.navigate(Screen.Task2.route)
                }
            ) {
                Text("Task2")
            }

            Button(
                onClick = {
                    navController.navigate(Screen.Task3.route)
                }
            ) {
                Text("Task3")
            }

            Button(
                onClick = {
                    navController.navigate(Screen.Task4.route)
                }
            ) {
                Text("Task4")
            }

            Button(
                onClick = {
                    navController.navigate(Screen.Task5.route)
                }
            ) {
                Text("Task5")
            }

            Button(
                onClick = {
                    navController.navigate(Screen.Task6.route)
                }
            ) {
                Text("Task6")
            }

            Button(
                onClick = {
                    navController.navigate(Screen.Task7.route)
                }
            ) {
                Text("Task7")
            }

            Button(
                onClick = {
                    navController.navigate(Screen.Task8.route)
                }
            ) {
                Text("Task8")
            }
        }
    }
}