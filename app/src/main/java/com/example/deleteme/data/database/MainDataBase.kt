package com.example.deleteme.data.database

import android.content.Context
import android.util.Log
import com.example.deleteme.R
import javax.inject.Inject

class MainDataBase @Inject constructor(private val context: Context) {

    fun method() {
        Log.d(LOG_TAG, "MainDataBase ${context.getString(R.string.app_name)}")
    }

    companion object {
        private const val LOG_TAG = "MAIN_TEST"
    }
}