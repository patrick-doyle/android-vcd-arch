package com.pdoyle.vcd.features.splash.di

import androidx.lifecycle.lifecycleScope
import com.pdoyle.vcd.features.splash.SplashActivity
import com.pdoyle.vcd.features.splash.SplashScreenCoordinator
import com.pdoyle.vcd.features.splash.SplashScreenData
import com.pdoyle.vcd.features.splash.SplashScreenView
import dagger.Module
import dagger.Provides

@Module
class SplashScreenModule(private val splashActivity: SplashActivity) {

    @Provides
    @SplashScreenScope
    fun data(): SplashScreenData = SplashScreenData()

    @Provides
    @SplashScreenScope
    fun view(): SplashScreenView = SplashScreenView(splashActivity)

    @Provides
    @SplashScreenScope
    fun coordinator(view: SplashScreenView, data: SplashScreenData): SplashScreenCoordinator =
        SplashScreenCoordinator(splashActivity.lifecycleScope, view, data)
}