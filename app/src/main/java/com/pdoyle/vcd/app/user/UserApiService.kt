package com.pdoyle.vcd.app.user

import retrofit2.http.GET

interface UserApiService {

    @GET("/users")
    suspend fun getUsers(): List<ApiUser>

}