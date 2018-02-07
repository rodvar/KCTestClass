package com.rodvar.clasepruebakc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainActivityPresenter : MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        this.mainActivityPresenter.bind(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.countButton.setOnClickListener({ _ ->
            this.mainActivityPresenter.onCountClicked()
            this.refresh()
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        this.mainActivityPresenter.unbind()
    }

    override fun onResume() {
        super.onResume()
        this.refresh()
    }

    private fun refresh() {
        this.counter.text = this.mainActivityPresenter.count.toString()
    }
}
