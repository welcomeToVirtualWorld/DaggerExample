package com.example.daggerexample.daggerwithmvvm.activity.retrofit

import com.example.daggerexample.daggerwithmvvm.activity.models.ProductsItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("products")
    suspend fun getProducts() : Response<List<ProductsItem>>
}