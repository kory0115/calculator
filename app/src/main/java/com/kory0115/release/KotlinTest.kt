package com.kory0115.release

fun main() {

    var result = 0
    var i = 0
    println("첫번쨰 숫자를 입력해주세요: ")
    val numa : Int = readLine()!!.toInt()

    while(true) {
        println("두번쨰 숫자를 입력해주세요: ")
        val numb : Int = readLine()!!.toInt()

        println("1.+, 2.-, 3.*, 4./, 5.종료: ")
        i = readLine()!!.toInt()
        when(i) {
                1 -> {
                    result = Calculator().add(numa, numb).toInt()
                    println(result)
                    result = numa
                }
                2 -> {
                    result = Calculator().sub(numa, numb).toInt()
                    println(result)
                    result = numa
                }
                3 -> {
                    result = Calculator().mul(numa, numb).toInt()
                    println(result)
                    result = numa
                }
                4 -> {
                    result = Calculator().division(numa, numb).toInt()
                }
                5 -> {
                    println("종료 되었습니다.")
                    break
                }
        }
    }
}


class Calculator {
    var sum = 0.0

    fun add(num1: Int, num2: Int): Double {
        sum = (num1 + num2).toDouble()
        return sum
    }

    fun sub(num1: Int, num2: Int): Double{
        sum = (num1 - num2).toDouble()
        return sum
    }

    fun mul(num1: Int, num2: Int): Double {
        sum = (num1 * num2).toDouble()
        return sum
    }

    fun division(num1: Int, num2: Int): Double {
        sum = (num1 / num2).toDouble()
        return sum
    }
}