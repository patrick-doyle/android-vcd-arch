package com.pdoyle.vcd.app.network

import com.pdoyle.vcd.app.di.AppScope
import com.pdoyle.vcd.app.user.UserApiService
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import javax.inject.Qualifier

@Module
class NetworkModule {

    @Provides
    @AppScope
    fun json(): Json = Json { ignoreUnknownKeys = true }

    @Provides
    @AppScope
    fun okhttp(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @AppScope
    fun retrofit(okHttpClient: OkHttpClient, json: Json): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(json.asConverterFactory(ContentType.applicationJson))
            .build()
    }

    @Provides
    @AppScope
    fun usersApiService(retrofit: Retrofit): UserApiService {
        return retrofit.create(UserApiService::class.java)
    }
}