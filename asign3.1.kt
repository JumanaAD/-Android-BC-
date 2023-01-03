package com.example.jumanaalduhim

fun main() {
    calculator(5.0,3.0)
    calculator(5.0,3.0,"-")
    calculator(5.0,3.0,"*")
    calculator(5.0,3.0,"/")
}
fun calculator( num1: Double  , num2 : Double,  s :String = "+" ) {
    var calc = 0.0
    when (s) {
        "+" -> {
            calc = num1 + num2
            println(calc)
        }
        "-" -> {
            calc = num1 - num2
            println(calc)
        }
        "*" -> {
            calc = num1 * num2
            println(calc)
        }
        "/" -> {
            calc = num1 / num2
            println(calc)
        }
        else -> println("not excepted ")
    }
}

