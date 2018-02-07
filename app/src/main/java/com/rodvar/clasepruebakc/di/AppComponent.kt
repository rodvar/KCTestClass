package com.rodvar.clasepruebakc.di

import android.app.Application
import com.rodvar.clasepruebakc.ClasePruebaKcApplication
import com.rodvar.clasepruebakc.MainActivity
import com.rodvar.clasepruebakc.MainModule
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
        MainModule::class,
        BinderModule::class,
        AppModule::class // add more modules separated by commas..
))
interface AppComponent {

    fun inject(app : ClasePruebaKcApplication)
    fun inject(activity: MainActivity)
}