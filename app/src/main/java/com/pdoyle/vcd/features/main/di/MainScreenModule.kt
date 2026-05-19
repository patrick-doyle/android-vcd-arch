package com.pdoyle.vcd.features.main.di

import androidx.lifecycle.lifecycleScope
import com.pdoyle.vcd.features.main.MainActivity
import com.pdoyle.vcd.features.main.MainScreenCoordinator
import com.pdoyle.vcd.features.main.MainScreenData
import com.pdoyle.vcd.features.main.MainScreenView
import dagger.Module
import dagger.Provides

@Module
class MainScreenModule(private val mainActivity: MainActivity) {

    @Provides
    @MainScreenScope
    fun data(): MainScreenData = MainScreenData()

    @Provides
    @MainScreenScope
    fun view(): MainScreenView = MainScreenView(mainActivity)

    @Provides
    @MainScreenScope
    fun coordinator(view: MainScreenView, data: MainScreenData): MainScreenCoordinator =
        MainScreenCoordinator(mainActivity.lifecycleScope, view, data)
}
