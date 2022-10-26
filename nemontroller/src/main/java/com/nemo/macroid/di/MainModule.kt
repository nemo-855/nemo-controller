package com.nemo.macroid.di

import com.nemo.macroid.data.repository.ControllerRepositoryImpl
import com.nemo.macroid.data.service.ControllerService
import com.nemo.macroid.data.service.ControllerServiceImpl

internal fun getControllerService(): ControllerService {
    return ControllerServiceImpl(
        controllerRepository = ControllerRepositoryImpl()
    )
}
