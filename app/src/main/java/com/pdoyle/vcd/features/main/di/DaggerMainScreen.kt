package com.pdoyle.vcd.features.main.di

import com.pdoyle.vcd.app.VCDApplication
import com.pdoyle.vcd.features.main.MainActivity
import dagger.Subcomponent
import javax.inject.Scope

@Scope
annotation class MainScreenScope

@MainScreenScope
@Subcomponent(modules = [MainScreenModule::class])
interface MainScreenComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(module: MainScreenModule): MainScreenComponent
    }
}

fun MainActivity.injectMainScreen() {
    VCDApplication.component(this)
        .mainScreenComponent()
        .create(MainScreenModule(this))
        .inject(this)
}
