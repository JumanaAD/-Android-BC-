package com.example.jumanaalduhim

fun main() {
    var doublearray= arrayListOf<Double>()
    doublearray.add(3.0)
    doublearray.add(3.0)
    doublearray.add(3.0)
    doublearray.add(3.0)
    doublearray.add(3.0)
    var avg =0.0
    var cal =0.0
    for(elements in doublearray){
        cal+=elements

    } 
    avg = (cal) / doublearray.size
    println("avg is $avg")
}
