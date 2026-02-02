package com.example.architecture_and_data.viewmodels.task1_viewmodels

import androidx.lifecycle.ViewModel
import com.example.architecture_and_data.models.task1_models.ToDoAppModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ToDoAppViewModel : ViewModel(){
//    private var uiState = mutableStateOf(ToDoAppModel())
//    val _uiState = uiState
    private  var _uiState = MutableStateFlow(ToDoAppModel())

    val uiState = _uiState.asStateFlow()

    fun onInputChange(input:String){
        _uiState.value = ToDoAppModel(uiState.value.todos,input,false)
    }

    fun addTodo(){
        if(_uiState.value.input.isBlank()) {
            _uiState.value = _uiState.value.copy(error = true)
            return
        }
        _uiState.value = ToDoAppModel(_uiState.value.todos + _uiState.value.input.trim() , "",false)
    }

    fun removeTodo(todo:String){
        _uiState.value = ToDoAppModel(_uiState.value.todos - todo,_uiState.value.input,_uiState.value.error)
    }
}