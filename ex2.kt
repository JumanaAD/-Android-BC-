package com.example.jumanaalduhim

fun main() {


    for (i in 0..100) {
        if (i == 71)  
            println("its over 70!!!!")
        break
    }

    var temp = 35
    while (temp >= 10) {
        when (temp) {
            30 -> println("$temp too hoot")
            20 -> println("$temp comfy")
            15 -> println("$temp cold")
            else -> {
                println("the temp is $temp")
            }
        }
        temp--
    }
}
