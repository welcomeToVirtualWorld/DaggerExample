package com.example.daggerexample.daggerwithmvvm.activity.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerexample.FirebaseRepository
import com.example.daggerexample.daggerwithmvvm.activity.models.ProductsItem
import com.example.daggerexample.daggerwithmvvm.activity.repository.ProductRepo
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class ProductsViewModel(private val repository: ProductRepo) : ViewModel() {

    val productsLiveData:LiveData<List<ProductsItem>>
        get() {
            return repository.products
        }

    init {
        viewModelScope.launch(IO) {
            repository.getProducts()
        }
    }
}