package com.example.deleteme.data.datasource

import com.example.deleteme.data.database.MainDataBase
import javax.inject.Inject

class MainLocalDataSourceImpl @Inject constructor(
    private val database: MainDataBase,
) : MainLocalDataSource {
    override fun method() {
        database.method()
    }
}