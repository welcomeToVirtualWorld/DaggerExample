package com.example.daggerexample

import android.util.Log
import javax.inject.Inject


interface NotificationService{
    fun send(to:String,from:String,body: String?)
}
class EmailService @Inject constructor():NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("UserRepo","Email sent")
    }
}

class SmsService():NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d("UserRepo","Sms sent")
    }

}