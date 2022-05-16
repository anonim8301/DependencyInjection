package com.example.deleteme.presentation

import com.example.deleteme.domain.use_cases.MainUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val use_case: MainUseCase,
) {

    fun method() {
        use_case()
    }
}