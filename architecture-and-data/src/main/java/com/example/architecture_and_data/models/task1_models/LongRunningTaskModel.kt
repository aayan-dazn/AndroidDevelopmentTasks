package com.example.architecture_and_data.models.task1_models

data class LongRunningTaskModel(
    val isLoading: Boolean = false,
    val result: String? = null
)