package com.nemo.macroid.data.repository

import com.nemo.macroid.data.domain.Controller

interface ControllerRepository {
    fun getControllers(): List<Controller>
}
