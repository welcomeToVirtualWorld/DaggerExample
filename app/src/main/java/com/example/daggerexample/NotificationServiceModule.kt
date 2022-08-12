package com.example.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("sms")
    @Provides
    fun getMessageService():NotificationService{
        return SmsService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService:EmailService):NotificationService{
        return emailService
    }


}