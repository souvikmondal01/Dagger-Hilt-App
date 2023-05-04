package com.kivous.car

import android.util.Log
import javax.inject.Inject

class Wheel {

    @Inject
    constructor()
    fun getWheel() {
        Log.d("CAR", "Wheel started...")
    }
}
