package com.example.daggerexample.daggerwithmvvm.activity.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query
import com.example.daggerexample.daggerwithmvvm.activity.models.ProductsItem

@Dao
interface ProductsDAO {

    @Insert(onConflict = IGNORE)
    suspend fun addProducts(products:List<ProductsItem>)

    @Query("Select * From Products")
    suspend fun getProducts() : List<ProductsItem>
}