package com.example.deleteme.di

import com.example.deleteme.data.repository.MainRepositoryImpl
import com.example.deleteme.domain.repository.MainRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: MainRepositoryImpl): MainRepository
}