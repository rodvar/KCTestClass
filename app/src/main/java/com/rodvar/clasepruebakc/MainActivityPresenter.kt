package com.rodvar.clasepruebakc

import android.support.v7.app.AppCompatActivity

/**
 * Created by rodvar on 7/2/18.
 */
class MainActivityPresenter {

    internal var count: Int = 0
    private var view: AppCompatActivity? = null

    fun bind(activity: AppCompatActivity) {
        this.view = activity
    }

    fun unbind() {
        this.view = null
    }


    fun onCountClicked() {
        this.count++
    }
}