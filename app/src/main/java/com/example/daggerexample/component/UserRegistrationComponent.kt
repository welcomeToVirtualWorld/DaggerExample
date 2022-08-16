package com.example.daggerexample.component

import com.example.daggerexample.activity.MainActivity
import com.example.daggerexample.module.NotificationServiceModule
import com.example.daggerexample.module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
//    fun getUserRegistrationService():UserRegistration
//    fun getEmailService():EmailService

}