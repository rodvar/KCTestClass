package com.rodvar.clasepruebakc

import android.app.Activity
import android.app.Application
import com.rodvar.clasepruebakc.di.AppComponent
import com.rodvar.clasepruebakc.di.AppModule
import com.rodvar.clasepruebakc.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by rodvar on 7/2/18.
 */
class ClasePruebaKcApplication : Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        this.createApplicationComponent()
    }

    /**
     * Creates the main app component installing the main App Module
     */
    private fun createApplicationComponent() {
        component = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        component.inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}