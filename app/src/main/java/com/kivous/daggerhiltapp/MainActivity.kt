package com.kivous.daggerhiltapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kivous.interfaces.Main
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var main: Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main.getName()
    }
}