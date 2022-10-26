package com.nemo.macroid.data.service

import com.nemo.macroid.data.domain.Controller
import com.nemo.macroid.data.repository.ControllerRepository

internal class ControllerServiceImpl (
    private val controllerRepository: ControllerRepository
) : ControllerService {
    override fun getControllers(): List<Controller> {
        return controllerRepository.getControllers()
    }
}
