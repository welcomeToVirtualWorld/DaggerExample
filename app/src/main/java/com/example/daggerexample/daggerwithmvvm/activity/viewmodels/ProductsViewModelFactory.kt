package com.example.daggerexample.daggerwithmvvm.activity.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerexample.daggerwithmvvm.activity.repository.ProductRepo
import javax.inject.Inject

class ProductsViewModelFactory @Inject constructor(private val repo: ProductRepo) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductsViewModel(repo) as T
    }
}