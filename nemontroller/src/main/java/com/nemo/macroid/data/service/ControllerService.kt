package com.nemo.macroid.data.service

import com.nemo.macroid.data.domain.Controller

internal interface ControllerService {
    fun getControllers(): List<Controller>
}
