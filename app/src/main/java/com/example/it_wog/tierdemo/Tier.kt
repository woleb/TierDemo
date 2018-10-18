package com.example.it_wog.tierdemo

import android.util.Log

//Vererbung von AbstractTier alle Funktionen müssen benutzt werden
open class Tier (alter: Int, speed: Int, name: String): AbstractTier(alter, speed, name) {

    //Überschreiben der Funktione aus AbstractTier
    override fun aelter(neuesAlter: Int) {
        alter = neuesAlter
        Log.i("Test", "Neues Alter: $alter")
    }

    override fun gibInfo(): String {
        val text = "Info: $name ist $alter Jahre alt und ist $speed km schnell"
        Log.i("Test", text)
        return text
    }
}