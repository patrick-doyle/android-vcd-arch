package com.pdoyle.vcd.app.user

import java.time.LocalDateTime

data class User(
    val id: String,
    val name: String,
    val signupDate: LocalDateTime
)
