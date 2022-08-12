package com.example.daggerexample

import dagger.Component
import javax.inject.Inject

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
//    fun getUserRegistrationService():UserRegistration
//    fun getEmailService():EmailService

}