package com.mahdi20.koin

import android.app.Application
import com.mahdi20.koin.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(AppModule)
        }

    }
}
