package com.example.deleteme.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.deleteme.R
import com.example.deleteme.di.ContextModule
import com.example.deleteme.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(application))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}