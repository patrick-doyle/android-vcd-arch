package com.pdoyle.vcd.app.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

private val iso8601Formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME

fun LocalDateTime.toIso8601String(): String = iso8601Formatter.format(this)

fun String.toLocalDateTimeFromIso8601(): LocalDateTime = LocalDateTime.parse(this, iso8601Formatter)

