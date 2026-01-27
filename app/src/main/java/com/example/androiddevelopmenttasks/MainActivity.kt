package com.example.androiddevelopmenttasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevelopmenttasks.screen.Tasks
import com.example.androiddevelopmenttasks.ui.theme.AndroidDevelopmentTasksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidDevelopmentTasksTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tasks(innerPadding)
                }
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun TasksPreview() {
//    AndroidDevelopmentTasksTheme {

//    }
//}