package com.pdoyle.vcd.features.main

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.pdoyle.vcd.features.main.di.MainScreenScope
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@MainScreenScope
class MainScreenCoordinator @Inject constructor(
    private val scope: CoroutineScope,
    private val view: MainScreenView,
    private val data: MainScreenData): DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {

    }
}