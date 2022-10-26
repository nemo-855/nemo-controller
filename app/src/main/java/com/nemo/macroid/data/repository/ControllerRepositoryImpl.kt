package com.nemo.macroid.data.repository

import android.view.InputDevice
import android.view.InputDevice.SOURCE_GAMEPAD
import android.view.InputDevice.SOURCE_JOYSTICK
import com.nemo.macroid.data.domain.Controller
import javax.inject.Inject

class ControllerRepositoryImpl @Inject constructor() : ControllerRepository {
    override fun getControllers(): List<Controller> {
        return InputDevice.getDeviceIds().map { deviceId ->
            val inputDevice = InputDevice.getDevice(deviceId)
            when {
                inputDevice.sources and SOURCE_GAMEPAD == SOURCE_GAMEPAD -> Controller.GamePad
                inputDevice.sources and SOURCE_JOYSTICK == SOURCE_JOYSTICK -> Controller.JoyStick
                else -> Controller.Else
            }
        }
    }
}

