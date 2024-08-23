package com.bhavenshah.dagger2

import android.app.Application
import com.bhavenshah.dagger2.di.component.ApplicationComponent
import com.bhavenshah.dagger2.di.component.DaggerApplicationComponent
import com.bhavenshah.dagger2.di.module.ApplicationModule

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