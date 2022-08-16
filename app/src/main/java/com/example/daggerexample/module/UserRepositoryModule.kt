package com.example.daggerexample.module

import com.example.daggerexample.FirebaseRepository
import com.example.daggerexample.SqlRepository
import com.example.daggerexample.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {


//    @Provides
//    fun getFirebaseRepository():UserRepository{
//        return FirebaseRepository()
//    }

    @Binds
    abstract fun getFirebaseRepository(sqlRepository: SqlRepository): UserRepository
}