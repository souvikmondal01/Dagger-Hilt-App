package com.kivous.interfaces

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

class Main @Inject constructor(
    @FName
    private val fName: String,
    @LName
    private val lName: String
) {
    fun getName() {
        Log.d("TAG", "My name is $fName $lName")
    }
}


@Module
@InstallIn(SingletonComponent::class)
class AppModule() {
    @Provides
    @FName
    fun getFName(): String = "Souvik"

    @Provides
    @LName
    fun getLName(): String = "Mondal"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName