package com.example.deleteme.data.repository

import com.example.deleteme.data.datasource.MainLocalDataSourceImpl
import com.example.deleteme.data.datasource.MainRemoteDataSourceImpl
import com.example.deleteme.data.mapper.MainMapper
import com.example.deleteme.domain.repository.MainRepository
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mapper: MainMapper,
    private val localDatasource: MainLocalDataSourceImpl,
    private val remoteDatasource: MainRemoteDataSourceImpl,
) : MainRepository {
    override fun method() {
        mapper.map()
        localDatasource.method()
        remoteDatasource.method()
    }
}