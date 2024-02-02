package com.example.hellohilt

import dagger.Binds
import dagger.Module
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [FirstModule::class]
)
abstract class FirstTestModule {
    @Singleton
    @Binds
    abstract fun bindFooRepository(fooRepositoryImpl: FakeFooRepository): FooRepository
}
