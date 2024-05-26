package com.bhavenshah.mynewsapp.di.component

import com.bhavenshah.mynewsapp.di.ActivityScope
import com.bhavenshah.mynewsapp.di.module.ActivityModule
import com.bhavenshah.mynewsapp.ui.topheadline.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}