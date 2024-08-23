package com.bhavenshah.dagger2.di.component

import android.content.Context
import com.bhavenshah.dagger2.NewsApplication
import com.bhavenshah.dagger2.data.api.NetworkService
import com.bhavenshah.dagger2.data.repository.TopHeadlineRepository
import com.bhavenshah.dagger2.di.ApplicationContext
import com.bhavenshah.dagger2.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}