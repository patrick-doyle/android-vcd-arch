package com.pdoyle.vcd.features.detail

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.pdoyle.vcd.features.detail.di.DetailScreenScope
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@DetailScreenScope
class DetailScreenCoordinator @Inject constructor(
    private val scope: CoroutineScope,
    private val view: DetailScreenView,
    private val data: DetailScreenData) : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {

    }
}