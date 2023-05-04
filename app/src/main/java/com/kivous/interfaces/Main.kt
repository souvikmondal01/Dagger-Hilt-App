package com.kivous.interfaces

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One {
    fun getName()
}

class ImpOne @Inject constructor() : One {
    override fun getName() {
        Log.d("CAR", "My name is Souvik")
    }
}

class Main @Inject constructor(private val one: One) {
    fun getName() {
        one.getName()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule() {

    @Binds
    @Singleton
    abstract fun binding(
        impOne: ImpOne
    ): One
}