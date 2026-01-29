package com.example.jetpack_compose_mastery.ui.task3_screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CounterScreen(modifier: Modifier = Modifier) {

    var count by rememberSaveable { mutableIntStateOf(0) }
    val isPositive by remember { derivedStateOf {
        count>=0
    } }
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Counter", fontSize = 32.sp, fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline)
            Text("(Without MVVM)")

            Text("$count", fontSize = 64.sp, color = if(isPositive) Color.Green else Color.Red)

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {
                        count--
                    }
                ) {
                    Text("-")
                }
                Button(
                    onClick = {
                        count=0
                    }
                ) {
                    Text("Reset")
                }
                Button(
                    onClick = {
                        count++
                    }
                ) {
                    Text("+")
                }
            }
        }
    }

}