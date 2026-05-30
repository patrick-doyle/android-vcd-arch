package com.pdoyle.vcd.app.eventrelay

import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.ExperimentalTime

fun View.clickRelay() : EventRelay<View> {
    val relay = EventRelay.create<View>()
    setOnClickListener { relay.send(it) }
    return relay
}