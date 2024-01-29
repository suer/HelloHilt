package com.example.hellohilt

import javax.inject.Inject

class FakeFooRepository @Inject constructor() : FooRepository{
    override fun fetch() = -1
}
