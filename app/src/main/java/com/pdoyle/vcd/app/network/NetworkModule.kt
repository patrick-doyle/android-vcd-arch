package com.pdoyle.vcd.app.network

import com.pdoyle.vcd.app.di.AppScope
import com.pdoyle.vcd.app.user.UserApiService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
class NetworkModule {

    @Provides
    @AppScope
    fun okhttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @AppScope
    fun retrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .build()
    }

    @Provides
    @AppScope
    fun usersApiService(retrofit: Retrofit): UserApiService {
        return retrofit.create(UserApiService::class.java)
    }
}