package com.pdoyle.vcd.app.di

import android.content.Context
import dagger.Module
import dagger.Reusable

@Module
class AppModule(private val context: Context) {

    @Reusable
    @AppScope
    fun context(): Context = context.applicationContext

}