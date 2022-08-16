package com.example.daggerexample.module

import com.example.daggerexample.EmailService
import com.example.daggerexample.NotificationService
import com.example.daggerexample.SmsService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @Named("sms")
    @Provides
    fun getMessageService(retryCount:Int): NotificationService {
        return SmsService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }


}