package com.pdoyle.vcd.features.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pdoyle.vcd.features.splash.di.SplashScreenScope
import com.pdoyle.vcd.ui.theme.VCDAppTheme
import javax.inject.Inject

@SplashScreenScope
class SplashScreenView @Inject constructor(
    private val activity: SplashActivity) {

    @Composable
    fun SplashScreen() {
        VCDAppTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { _ ->

            }
        }
    }
}