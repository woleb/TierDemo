package com.example.it_wog.tierdemo

abstract class AbstractTier (alter: Int, speed: Int, name : String){
    var alter = alter
    var speed = speed
    var name = name

    abstract fun aelter(neuesAlter : Int)
    abstract fun gibInfo(): String

}