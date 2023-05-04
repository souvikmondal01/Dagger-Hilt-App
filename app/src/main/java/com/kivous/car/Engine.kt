package com.kivous.car

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()

    fun getEngine() {
        Log.d("CAR", "Engine started...")
    }
}