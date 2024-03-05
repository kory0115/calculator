package com.kory0115.release

class Measurement {
    var num1: Double = 0.0
    var num2: Int = 0
    var sum = 0.0

    constructor(_number1: Double, _number2: Int) {
        num1 = _number1
        num2 = _number2
    }

    fun add(): Double {
        println(num1)
        println(num2)
        sum = num1 + num2
        return sum
    }

    fun sub(): Double{
        sum = num1 - num2
        return sum
    }

    fun mul(): Double {
        sum = num1 * num2
        return sum
    }

    fun division(): Double {
        sum = num1 / num2
        return sum
    }
    fun initials(): Double {
        sum = (num1 * 0)
        return sum
    }
}