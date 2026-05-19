package com.pdoyle.vcd.features.detail.di

import androidx.lifecycle.lifecycleScope
import com.pdoyle.vcd.features.detail.DetailActivity
import com.pdoyle.vcd.features.detail.DetailScreenCoordinator
import com.pdoyle.vcd.features.detail.DetailScreenData
import com.pdoyle.vcd.features.detail.DetailScreenView
import dagger.Module
import dagger.Provides

@Module
class DetailScreenModule(private val detailActivity: DetailActivity) {

    @Provides
    @DetailScreenScope
    fun data(): DetailScreenData = DetailScreenData()

    @Provides
    @DetailScreenScope
    fun view(): DetailScreenView = DetailScreenView(detailActivity)

    @Provides
    @DetailScreenScope
    fun coordinator(view: DetailScreenView, data: DetailScreenData): DetailScreenCoordinator =
        DetailScreenCoordinator(detailActivity.lifecycleScope, view, data)
}