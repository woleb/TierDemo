package com.example.it_wog.tierdemo

import android.util.Log

//Vererbung von Tier
class TierHund (alter: Int, speed: Int, name: String) : Tier (alter, speed, name){

    fun gibLaut (){

        Log.i("Test", "$name sagt: WAU WAU")
        aelter(alter + 1)
    }

}