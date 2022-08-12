package com.example.daggerexample

import android.provider.ContactsContract
import javax.inject.Inject
import javax.inject.Named

class UserRegistration @Inject constructor(
    private val userRepository:UserRepository,
    @Named("sms")private val notificationService:NotificationService
    ) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"nejn","njn")
    }
/*
* Unit Testing
* Single Responsibility
* Lifetime of these Objects
* Extensible
*/


}