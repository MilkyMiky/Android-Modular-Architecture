package com.example.user.modular.utils

import android.app.Activity
import android.util.Log
import com.example.user.modular.BuildConfig

fun Activity.logd(message : String) {
    if(BuildConfig.DEBUG)
        Log.d(this::class.java.simpleName, message)
}