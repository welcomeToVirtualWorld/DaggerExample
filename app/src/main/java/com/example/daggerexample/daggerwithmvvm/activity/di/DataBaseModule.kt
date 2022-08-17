package com.example.daggerexample.daggerwithmvvm.activity.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.daggerexample.daggerwithmvvm.activity.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Provides
    @Singleton
    fun getDatabaseInstance(context:Context):FakerDB{
        return Room.databaseBuilder(context,FakerDB::class.java,"FakerDB").build()
    }
}