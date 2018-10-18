package com.example.it_wog.tierdemo

import android.util.Log

//Vererbung von Tier
class TierCat (alter: Int, speed: Int, name: String) : Tier (alter, speed, name){

    fun gibLaut (){

        Log.i("Test", "$name sagt: Miau")
        aelter(alter + 2)
    }

}