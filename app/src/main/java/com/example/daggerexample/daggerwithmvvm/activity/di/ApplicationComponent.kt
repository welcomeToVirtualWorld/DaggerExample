package com.example.daggerexample.daggerwithmvvm.activity.di

import android.content.Context
import com.example.daggerexample.daggerwithmvvm.activity.FirstPage
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,DataBaseModule::class])
interface ApplicationComponent {

    fun inject(firstPage: FirstPage)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context:Context):ApplicationComponent
    }
}