package com.example.architecture_and_data

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.architecture_and_data.viewmodels.task1_viewmodels.ToDoAppViewModel


@Composable
fun Task1_A() {
    ToDoApp(Modifier.fillMaxSize().padding(16.dp))
}

@Composable
fun ToDoApp(modifier: Modifier = Modifier,viewModel: ToDoAppViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsState()
    Column(
        modifier,
    ) {
        Text("To-Do List", fontSize = 32.sp)
        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            TextField(
                value = uiState.input,
                onValueChange = viewModel::onInputChange,
                placeholder = { Text("Add your Task") },
            )
            Button(
                onClick = {
                    viewModel.addTodo()
                }
            ) {
                Text("Add")
            }
        }
        if(uiState.error) {
            Text("Todo Cannot be Empty", color = Color.Red)
        }
        LazyColumn()  {
            items(uiState.todos){ todo ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(todo)
                    IconButton(
                        onClick = {
                            viewModel.removeTodo(todo)
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Clear,
                            contentDescription = "Remove Todo",
                            tint = Color.LightGray,
                        )
                    }

                }

            }
        }
    }
}