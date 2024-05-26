package com.bhavenshah.mynewsapp.di.component

import android.content.Context
import com.bhavenshah.mynewsapp.NewsApplication
import com.bhavenshah.mynewsapp.data.api.NetworkService
import com.bhavenshah.mynewsapp.data.repository.TopHeadlineRepository
import com.bhavenshah.mynewsapp.di.ApplicationContext
import com.bhavenshah.mynewsapp.di.module.ApplicationModule
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