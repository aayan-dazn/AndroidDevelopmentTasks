package com.example.architecture_and_data.viewmodels.task1_viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.architecture_and_data.models.task1_models.LongRunningTaskModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LongRunningTaskViewModel : ViewModel(){
    private var _uiState = MutableStateFlow(LongRunningTaskModel())

    val uiState = _uiState.asStateFlow()

    fun startLongTask(){
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, result = null)

            delay(5000)

            _uiState.value = _uiState.value.copy(isLoading = false, result = "Long Running Task completed!")
        }
    }
}