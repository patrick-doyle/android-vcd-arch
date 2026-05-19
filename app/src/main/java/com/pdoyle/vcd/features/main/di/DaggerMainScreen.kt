package com.pdoyle.vcd.features.main.di

import com.pdoyle.vcd.features.main.MainActivity
import dagger.Component
import javax.inject.Scope

@Scope
annotation class MainScreenScope

@MainScreenScope
@Component(modules = [MainScreenModule::class])
interface MainScreenComponent {

    fun inject(mainActivity: MainActivity)
}

fun MainActivity.inject() {
    DaggerMainScreenComponent.builder().mainScreenModule(
        MainScreenModule(this)).build().inject(this)
}
