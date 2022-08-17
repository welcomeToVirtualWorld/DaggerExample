package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.component.DaggerUserRegistrationComponent
import com.example.daggerexample.component.UserRegistrationComponent

class UserApplication : Application() {
    lateinit var userRegistrationComponent:UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}