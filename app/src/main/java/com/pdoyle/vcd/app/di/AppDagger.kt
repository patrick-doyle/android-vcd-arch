package com.pdoyle.vcd.app.di

import android.app.Application
import android.content.Context
import com.pdoyle.vcd.features.main.di.MainScreenComponent
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Reusable
import javax.inject.Scope

@Scope
annotation class AppScope

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun mainScreenComponent(): MainScreenComponent.Factory

}

fun Application.appComponent(): AppComponent {
    return DaggerAppComponent.builder()
        .appModule(AppModule(this))
        .build()
}