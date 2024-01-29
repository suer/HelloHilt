package com.example.hellohilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val fooRepository: FooRepository
) : ViewModel() {
    fun getText() : String {
        return fooRepository.fetch().toString()
    }
}
