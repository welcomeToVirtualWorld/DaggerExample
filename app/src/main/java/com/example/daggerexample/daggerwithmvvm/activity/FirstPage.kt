package com.example.daggerexample.daggerwithmvvm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.daggerexample.R
import com.example.daggerexample.daggerwithmvvm.activity.viewmodels.ProductsViewModel
import com.example.daggerexample.daggerwithmvvm.activity.viewmodels.ProductsViewModelFactory
import javax.inject.Inject

class FirstPage : AppCompatActivity() {
    lateinit var productViewModel:ProductsViewModel

    @Inject
    lateinit var factory:ProductsViewModelFactory

    private val products:TextView
        get() = findViewById(R.id.title)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        (application as FakerApplication).applicationComponent.inject(this)
        productViewModel = ViewModelProvider(this,factory).get(ProductsViewModel::class.java)

        productViewModel.productsLiveData.observe(this, Observer {
            products.text = it.joinToString { x -> x.title + "\n\n" }
        })
    }
}