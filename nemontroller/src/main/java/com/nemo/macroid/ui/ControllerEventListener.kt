package com.nemo.macroid.ui

import android.view.KeyEvent
import android.view.MotionEvent

interface ControllerEventListener {
    fun onControllerGenericMotionEvent(event: MotionEvent?)
    fun onKeyDown(keyCode: Int, event: KeyEvent?)
    fun onKeyUp(keyCode: Int, event: KeyEvent?)
}
