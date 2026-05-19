package com.pdoyle.vcd.features.splash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdoyle.vcd.features.splash.di.injectSplashScreen
import javax.inject.Inject

class SplashActivity : ComponentActivity() {

    @Inject
    lateinit var view: SplashScreenView

    @Inject
    lateinit var coordinator: SplashScreenCoordinator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        injectSplashScreen()
        lifecycle.addObserver(coordinator)

        enableEdgeToEdge()
        setContent { view.SplashScreen() }
    }
}