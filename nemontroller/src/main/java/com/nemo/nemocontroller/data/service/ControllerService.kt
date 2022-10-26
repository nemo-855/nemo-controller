package com.nemo.nemocontroller.data.service

import com.nemo.nemocontroller.data.domain.Controller

internal interface ControllerService {
    fun getControllers(): List<Controller>
}
