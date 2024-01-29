package com.example.hellohilt

import javax.inject.Inject

interface FooRepository {
    fun fetch(): Int
}
class FooRepositoryImpl @Inject constructor() : FooRepository {
    override fun fetch() = (Math.random() * 10000).toInt()
}
