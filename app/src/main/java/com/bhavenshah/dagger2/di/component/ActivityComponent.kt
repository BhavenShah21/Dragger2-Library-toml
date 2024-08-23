package com.bhavenshah.dagger2.di.component

import com.bhavenshah.dagger2.di.ActivityScope
import com.bhavenshah.dagger2.di.module.ActivityModule
import com.bhavenshah.dagger2.ui.topheadline.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}