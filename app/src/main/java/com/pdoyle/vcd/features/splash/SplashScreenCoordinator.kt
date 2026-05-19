package com.pdoyle.vcd.features.splash

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.pdoyle.vcd.features.splash.di.SplashScreenScope
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@SplashScreenScope
class SplashScreenCoordinator @Inject constructor(
    private val scope: CoroutineScope,
    private val view: SplashScreenView,
    private val data: SplashScreenData) : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {

    }
}