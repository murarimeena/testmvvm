package com.example.test.appcontroller

import android.app.Application
import com.example.test.BuildConfig
import timber.log.Timber
import timber.log.Timber.DebugTree


class AppController : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}