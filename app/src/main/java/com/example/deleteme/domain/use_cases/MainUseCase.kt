package com.example.deleteme.domain.use_cases

import com.example.deleteme.domain.repository.MainRepository
import javax.inject.Inject

class MainUseCase @Inject constructor(
    private val repository: MainRepository,
) {
    operator fun invoke() {
        repository.method()
    }
}