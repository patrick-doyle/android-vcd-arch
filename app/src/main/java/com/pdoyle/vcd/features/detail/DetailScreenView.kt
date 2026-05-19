package com.pdoyle.vcd.features.detail

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Scaffold
import com.pdoyle.vcd.features.detail.di.DetailScreenScope
import com.pdoyle.vcd.ui.theme.VCDAppTheme
import javax.inject.Inject

@DetailScreenScope
class DetailScreenView @Inject constructor(
    private val activity: DetailActivity) {

    @Composable
    fun DetailScreen() {
        VCDAppTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { _ ->

            }
        }
    }
}