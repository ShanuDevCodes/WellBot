package com.termin8rs.healthai.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainUIViewmodel: ViewModel() {
    private val _position = MutableStateFlow(0)
    val position = _position.asStateFlow()

    fun updatePosition(position: Int){
        _position.value = position
    }
}