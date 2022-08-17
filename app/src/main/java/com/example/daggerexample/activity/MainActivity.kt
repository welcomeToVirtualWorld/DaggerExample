package com.example.daggerexample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.EmailService
import com.example.daggerexample.R
import com.example.daggerexample.UserApplication
import com.example.daggerexample.UserRegistration
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    @Inject
//    lateinit var userRegistrationService: UserRegistration
//
//    @Inject
//    lateinit var emailService:EmailService
//
//    @Inject
//    lateinit var emailService1:EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component = (application as UserApplication).userRegistrationComponent
//        component.inject(this)
//        userRegistrationService.registerUser("bhheb","bhheb")
    }
}