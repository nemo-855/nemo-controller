package com.nemo.macroid.util

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.view.View

internal fun View.requireActivity(): Activity {
    return this.activityOrNull()!!
}

internal fun View.activityOrNull(): Activity? {
    return context.activityOrNull()
}

internal fun Context.activityOrNull(): Activity? {
    return when (this) {
        is Activity -> this
        is ContextWrapper -> this.baseContext.activityOrNull()
        else -> null
    }
}
