package com.pdoyle.vcd.features.splash.di

import com.pdoyle.vcd.app.VCDApp
import com.pdoyle.vcd.features.splash.SplashActivity
import dagger.Subcomponent
import javax.inject.Scope

@Scope
annotation class SplashScreenScope

@SplashScreenScope
@Subcomponent(modules = [SplashScreenModule::class])
interface SplashScreenComponent {

    fun inject(splashActivity: SplashActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(module: SplashScreenModule): SplashScreenComponent
    }
}

fun SplashActivity.injectSplashScreen() {
    VCDApp.component(this)
        .splashScreenComponent()
        .create(SplashScreenModule(this))
        .inject(this)
}