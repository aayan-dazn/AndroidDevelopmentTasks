package com.example.jetpack_compose_mastery

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpack_compose_mastery.task1_screens.LoginScreen

@Composable
fun Task1(){
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        LoginScreen()
    }
}
