package com.nemo.macroid.data.repository

import com.nemo.macroid.data.domain.Controller

internal interface ControllerRepository {
    fun getControllers(): List<Controller>
}
