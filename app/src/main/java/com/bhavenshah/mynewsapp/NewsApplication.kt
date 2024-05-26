package com.bhavenshah.mynewsapp

import android.app.Application
import com.bhavenshah.mynewsapp.di.component.ApplicationComponent
import com.bhavenshah.mynewsapp.di.component.DaggerApplicationComponent
import com.bhavenshah.mynewsapp.di.module.ApplicationModule

class NewsApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}