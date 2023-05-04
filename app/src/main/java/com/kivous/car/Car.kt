package com.kivous.car

import android.util.Log
import android.widget.Toast
import javax.inject.Inject


class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCar() {
        Log.d("CAR", "Car is running...")
        engine.getEngine()
        wheel.getWheel()
    }

}