package com.example.jetpack_compose_mastery.ui.task7_screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThemeSwitcher(
    isDark: Boolean,
    onToggle: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = if (isDark) "Dark Mode" else "Light Mode",
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onToggle) {
            Text("Toggle Theme")
        }
    }
}
