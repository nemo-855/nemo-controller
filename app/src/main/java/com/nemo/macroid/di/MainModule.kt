package com.nemo.macroid.di

import com.nemo.macroid.data.repository.ControllerRepository
import com.nemo.macroid.data.repository.ControllerRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface MainModule {

    @Binds
    abstract fun bindControllerRepository(
        controllerRepositoryImpl: ControllerRepositoryImpl
    ): ControllerRepository
}

