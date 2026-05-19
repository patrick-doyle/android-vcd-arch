package com.pdoyle.vcd.features.detail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdoyle.vcd.features.detail.di.injectDetailScreen
import javax.inject.Inject

class DetailActivity : ComponentActivity() {

    @Inject
    lateinit var view: DetailScreenView

    @Inject
    lateinit var coordinator: DetailScreenCoordinator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        injectDetailScreen()
        lifecycle.addObserver(coordinator)

        enableEdgeToEdge()
        setContent { view.DetailScreen() }
    }
}