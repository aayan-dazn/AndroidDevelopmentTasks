package com.example.architecture_and_data.models.task1_models

data class ToDoAppModel(
    val todos : List<String> = emptyList(),
    val input: String = "",
    val error: Boolean = false
)