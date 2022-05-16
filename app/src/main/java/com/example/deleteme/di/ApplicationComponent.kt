package com.example.deleteme.di

import com.example.deleteme.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class , ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}