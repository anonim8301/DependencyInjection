package com.example.deleteme.data.datasource

import com.example.deleteme.data.network.MainApi
import javax.inject.Inject

class MainRemoteDataSourceImpl @Inject constructor(
    private val api: MainApi
) : MainRemoteDataSource {
    override fun method() {
        api.method()
    }
}