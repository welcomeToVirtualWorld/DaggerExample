package com.example.daggerexample.daggerwithmvvm.activity.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggerexample.daggerwithmvvm.activity.models.ProductsItem

@Database(entities = [ProductsItem::class], version = 1)
abstract class FakerDB : RoomDatabase() {

    abstract fun getFakerDao() : ProductsDAO

}