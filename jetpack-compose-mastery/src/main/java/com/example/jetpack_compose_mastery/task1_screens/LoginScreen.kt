package com.example.jetpack_compose_mastery.task1_screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.text.isNotBlank
import kotlin.text.isNotEmpty

@Composable
fun LoginScreen() {

    var mobile by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {

        TextField(
            value = mobile,
            onValueChange = { mobile = it },
            label = { Text("Mobile Number") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") }
        )

        if (error.isNotEmpty()) {
            Text(error, color = Color.Red)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (mobile.length == 10 && password.isNotBlank()) {
//                    saveLogin(mobile, password)
                } else {
                    error = "Invalid credentials"
                }
            }
        ) {
            Text("Login")
        }

        TextButton(onClick = {
//            navController.navigate(Screen.Signup.route)
        }) {
            Text("New User? Sign Up")
        }

        TextButton(onClick = {
//            navController.navigate(Screen.Forgot.route)
        }) {
            Text("Forgot Password?")
        }
    }
}