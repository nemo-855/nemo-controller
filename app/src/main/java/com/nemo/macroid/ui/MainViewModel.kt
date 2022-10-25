package com.nemo.macroid.ui

import androidx.lifecycle.ViewModel
import com.nemo.macroid.data.repository.ControllerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val controllerRepository: ControllerRepository
) : ViewModel() {
    fun getControllers() {
        controllerRepository.getControllers().map {
            it.name
        }
    }
}
