package com.example.daggerexample.component

import android.provider.ContactsContract
import com.example.daggerexample.ApplicationScope
import com.example.daggerexample.EmailService
import com.example.daggerexample.activity.MainActivity
import com.example.daggerexample.module.NotificationServiceModule
import com.example.daggerexample.module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)


    fun getEmailService():EmailService

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
//    fun getUserRegistrationService():UserRegistration
//    fun getEmailService():EmailService

}