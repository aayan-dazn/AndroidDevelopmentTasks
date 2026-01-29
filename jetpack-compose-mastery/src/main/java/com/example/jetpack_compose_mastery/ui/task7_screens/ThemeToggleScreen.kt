package com.example.jetpack_compose_mastery.ui.task7_screens

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun ThemeToggleScreen(
) {
    var isDark by rememberSaveable() { mutableStateOf(false) }

    val colors = if(isDark) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography()
    ){
        ThemeSwitcher(
            isDark,
            onToggle = {
                isDark=!isDark
            }
        )
    }
}