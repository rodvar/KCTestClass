package com.rodvar.clasepruebakc

import dagger.Module
import dagger.Provides

/**
 * Created by rodvar on 7/2/18.
 */
@Module
class MainModule {

    @Provides
    fun presenter() : MainActivityPresenter =  MainActivityPresenter()
}