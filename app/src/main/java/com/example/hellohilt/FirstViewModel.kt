package com.example.hellohilt

import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {
    fun getText() : String {
        return FooRepository().fetch().toString()
    }
}
