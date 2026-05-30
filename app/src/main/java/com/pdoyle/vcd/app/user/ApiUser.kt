package com.pdoyle.vcd.app.user

import com.pdoyle.vcd.app.util.toLocalDateTimeFromIso8601
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiUser(
    val id: String,
    val name: String,
    @SerialName("signup_date") val signupDate: String
) {
    fun toUser(): User {
        return User(id, name, signupDate.toLocalDateTimeFromIso8601())
    }
}
