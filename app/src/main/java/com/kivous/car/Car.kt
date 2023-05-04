package com.kivous.car

import android.util.Log
import android.widget.Toast
import javax.inject.Inject


class Car {

    @Inject
    constructor()
    fun getCar() {
        Log.d("CAR", "Car is running...")
    }
}