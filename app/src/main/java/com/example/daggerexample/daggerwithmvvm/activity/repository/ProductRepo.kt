package com.example.daggerexample.daggerwithmvvm.activity.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.daggerexample.daggerwithmvvm.activity.db.FakerDB
import com.example.daggerexample.daggerwithmvvm.activity.models.ProductsItem
import com.example.daggerexample.daggerwithmvvm.activity.retrofit.ApiService
import retrofit2.Response
import javax.inject.Inject


class ProductRepo @Inject constructor(private val apiService: ApiService,private val fakerDB: FakerDB) {

    private val _products = MutableLiveData<List<ProductsItem>>()
    val products: LiveData<List<ProductsItem>>
        get() = _products


    suspend fun getProducts() {
        val result = apiService.getProducts()
        if (result.isSuccessful && result.body()!=null){
            fakerDB.getFakerDao().addProducts(result.body()!!)
            _products.postValue(result.body())
        }
    }
}