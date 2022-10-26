package com.nemo.macroid.ui

import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import com.nemo.macroid.data.service.ControllerService
import com.nemo.macroid.di.getControllerService
import com.nemo.macroid.util.activityOrNull

class ControllerView(
    context: Context,
    attributeSet: AttributeSet
) : View(
    context,
    attributeSet
) {
    private val controllerService: ControllerService = getControllerService()

    override fun onGenericMotionEvent(event: MotionEvent?): Boolean {
        val listener = getControllerEventListener() ?: return false
        listener.onControllerGenericMotionEvent(event)
        return super.onGenericMotionEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        val listener = getControllerEventListener() ?: return false
        listener.onKeyDown(
            keyCode = keyCode,
            event = event,
        )
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        val listener = getControllerEventListener() ?: return false
        listener.onKeyUp(
            keyCode = keyCode,
            event = event,
        )
        return super.onKeyUp(keyCode, event)
    }

    private fun getControllerEventListener(): ControllerEventListener? {
        if (controllerService.getControllers().isEmpty()) {
            println("コントローラーが接続されていません")
            return null
        }

        val listener = context?.activityOrNull() as? ControllerEventListener
        if (listener == null) {
            println("ControllerEventListener が実装されていません")
            return null
        }

        return listener
    }
}
