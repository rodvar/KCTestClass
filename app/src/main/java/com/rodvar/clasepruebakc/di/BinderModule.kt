package com.rodvar.clasepruebakc.di

import com.rodvar.clasepruebakc.MainActivity
import com.rodvar.clasepruebakc.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by rodvar on 7/2/18.
 */
@Module
abstract class BinderModule {

    // could certify scope at compile time
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun bindMainActivity(): MainActivity

}