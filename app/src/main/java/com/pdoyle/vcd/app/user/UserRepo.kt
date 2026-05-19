package com.pdoyle.vcd.app.user

import com.pdoyle.vcd.app.di.AppScope
import javax.inject.Inject

@AppScope
class UserRepo @Inject constructor(
    private val userApiService: UserApiService,
) {

    suspend fun getUser(): List<User> {
        return userApiService.getUsers().map(
            transform = ApiUser::toUser
        )
    }
}