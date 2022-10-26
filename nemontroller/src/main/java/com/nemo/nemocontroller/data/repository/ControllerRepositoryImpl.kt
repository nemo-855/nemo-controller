package com.nemo.nemocontroller.data.repository

import android.view.InputDevice
import android.view.InputDevice.SOURCE_GAMEPAD
import android.view.InputDevice.SOURCE_JOYSTICK
import com.nemo.nemocontroller.data.domain.Controller
import javax.inject.Inject

internal class ControllerRepositoryImpl @Inject constructor() : ControllerRepository {
    override fun getControllers(): List<Controller> {
        return InputDevice.getDeviceIds().asSequence().mapNotNull { deviceId ->
            val inputDevice = InputDevice.getDevice(deviceId)
            when {
                inputDevice.sources and SOURCE_GAMEPAD == SOURCE_GAMEPAD -> Controller.GamePad
                inputDevice.sources and SOURCE_JOYSTICK == SOURCE_JOYSTICK -> Controller.JoyStick
                else -> null
            }
        }.toList()
    }
}
