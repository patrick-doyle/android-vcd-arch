package com.pdoyle.vcd.features.detail.di

import com.pdoyle.vcd.app.VCDApplication
import com.pdoyle.vcd.features.detail.DetailActivity
import dagger.Subcomponent
import javax.inject.Scope

@Scope
annotation class DetailScreenScope

@DetailScreenScope
@Subcomponent(modules = [DetailScreenModule::class])
interface DetailScreenComponent {

    fun inject(detailActivity: DetailActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(module: DetailScreenModule): DetailScreenComponent
    }
}

fun DetailActivity.injectDetailScreen() {
    VCDApplication.component(this)
        .detailScreenComponent()
        .create(DetailScreenModule(this))
        .inject(this)
}