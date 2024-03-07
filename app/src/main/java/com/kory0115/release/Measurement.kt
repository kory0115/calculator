package com.kory0115.release

class Measurement(_number1: Double, _number2: Double) {
    var num1: Double = _number1
    var num2: Double = _number2
    var sum = 0.0

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
    fun division2(): Double {
        sum = num1 % num2
        return sum
    }
}