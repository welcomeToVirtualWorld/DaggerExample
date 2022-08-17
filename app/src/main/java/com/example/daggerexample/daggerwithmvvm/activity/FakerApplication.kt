package com.example.daggerexample.daggerwithmvvm.activity

import android.app.Application
import com.example.daggerexample.daggerwithmvvm.activity.di.ApplicationComponent
import com.example.daggerexample.daggerwithmvvm.activity.di.DaggerApplicationComponent

class FakerApplication : Application(){

    lateinit var applicationComponent:ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(applicationContext)
    }
}