package com.kivous.interfaces

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One {
    fun getName()
}

class ImpOne @Inject constructor(private val name: String) : One {
    override fun getName() {
        Log.d("CAR", "My name is $name")
    }
}

class Main @Inject constructor(private val one: One) {
    fun getName() {
        one.getName()
    }
}

/*
@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule() {

    @Binds
    @Singleton
    abstract fun binding(
        impOne: ImpOne
    ): One
}
*/

@Module
@InstallIn(SingletonComponent::class)
class AppModule() {

    @Provides
    @Singleton
    fun getName(): String = "Souvik"

    @Provides
    @Singleton
    fun binding(
        name: String
    ): One = ImpOne(name)
}