package com.example.daggerexample.daggerwithmvvm.activity.di

import com.example.daggerexample.daggerwithmvvm.activity.retrofit.ApiService
import com.example.daggerexample.daggerwithmvvm.activity.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun getApiService(retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }
}