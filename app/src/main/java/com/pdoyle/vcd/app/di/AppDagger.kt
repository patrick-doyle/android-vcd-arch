package com.pdoyle.vcd.app.di

import android.app.Application
import com.pdoyle.vcd.app.network.NetworkModule
import com.pdoyle.vcd.features.detail.di.DetailScreenComponent
import com.pdoyle.vcd.features.main.di.MainScreenComponent
import dagger.Component
import javax.inject.Scope

@Scope
annotation class AppScope

@AppScope
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {

    fun mainScreenComponent(): MainScreenComponent.Factory

    fun detailScreenComponent(): DetailScreenComponent.Factory

}

fun Application.appComponent(): AppComponent {
    return DaggerAppComponent.builder()
        //.appModule(AppModule(context = this))
        .build()
}