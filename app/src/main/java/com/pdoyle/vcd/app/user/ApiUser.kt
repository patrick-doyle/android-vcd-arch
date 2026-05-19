package com.pdoyle.vcd.app.user

import com.pdoyle.vcd.app.util.toLocalDateTimeFromIso8601

data class ApiUser(
    val id: String,
    val name: String,
    val signupDate: String
) {
    fun toUser(): User {
        return User(id, name, signupDate.toLocalDateTimeFromIso8601())
    }
}
