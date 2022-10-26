package com.nemo.nemocontroller.data.service

import com.nemo.nemocontroller.data.domain.Controller
import com.nemo.nemocontroller.data.repository.ControllerRepository

internal class ControllerServiceImpl (
    private val controllerRepository: ControllerRepository
) : ControllerService {
    override fun getControllers(): List<Controller> {
        return controllerRepository.getControllers()
    }
}
