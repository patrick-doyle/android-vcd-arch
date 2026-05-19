package com.pdoyle.vcd.app

import android.app.Application
import android.content.Context
import com.pdoyle.vcd.app.di.AppComponent
import com.pdoyle.vcd.app.di.AppModule
import com.pdoyle.vcd.app.di.appComponent

class VCDApp : Application() {

    val appComponent: AppComponent by lazy { appComponent() }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        fun component(context: Context): AppComponent =
            (context.applicationContext as VCDApp).appComponent
    }
}