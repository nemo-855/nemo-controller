package com.nemo.nemocontroller.di

import com.nemo.nemocontroller.data.repository.ControllerRepositoryImpl
import com.nemo.nemocontroller.data.service.ControllerService
import com.nemo.nemocontroller.data.service.ControllerServiceImpl

internal fun getControllerService(): ControllerService {
    return ControllerServiceImpl(
        controllerRepository = ControllerRepositoryImpl()
    )
}
