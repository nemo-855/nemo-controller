package com.nemo.nemocontroller.data.repository

import com.nemo.nemocontroller.data.domain.Controller

internal interface ControllerRepository {
    fun getControllers(): List<Controller>
}
