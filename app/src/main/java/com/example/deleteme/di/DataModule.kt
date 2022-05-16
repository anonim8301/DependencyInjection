package com.example.deleteme.di

import com.example.deleteme.data.datasource.MainLocalDataSource
import com.example.deleteme.data.datasource.MainLocalDataSourceImpl
import com.example.deleteme.data.datasource.MainRemoteDataSource
import com.example.deleteme.data.datasource.MainRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(dataSource: MainLocalDataSourceImpl): MainLocalDataSource

    @Binds
    fun bindRemoteDataSource(dataSource: MainRemoteDataSourceImpl): MainRemoteDataSource
}