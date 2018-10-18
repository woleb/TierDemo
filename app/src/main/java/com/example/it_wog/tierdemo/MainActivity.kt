package com.example.it_wog.tierdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val waldi = TierHund (5, 30, "Waldi")
        waldi.gibLaut()
        waldi.gibLaut()
        val mimi = TierCat ( 5, 25 , "Mimi")
        mimi.gibLaut()
        mimi.gibLaut()
    }
}
