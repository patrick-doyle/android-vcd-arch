package com.pdoyle.vcd.features.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdoyle.vcd.features.main.di.inject
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var view: MainScreenView

    @Inject
    lateinit var coordinator: MainScreenCoordinator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inject()

        enableEdgeToEdge()
        setContent {

        }
    }
}