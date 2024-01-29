package com.example.hellohilt

class FooRepository {
    fun fetch() = (Math.random() * 10000).toInt()
}
