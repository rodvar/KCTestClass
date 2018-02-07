package com.rodvar.clasepruebakc.di

import android.app.Application
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * App component, define the main modules the app needs to be installed via @Component
 * Provides the main inject method to get the app injected with the main dependency graph
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        AppModule::class // add more modules separated by commas..
))
interface AppComponent {

    fun inject(app : Application)
}