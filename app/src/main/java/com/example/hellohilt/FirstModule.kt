package com.example.hellohilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class FirstModule {
    @Singleton
    @Binds
    abstract fun bindFooRepository(fooRepositoryImpl: FooRepositoryImpl): FooRepository
}
