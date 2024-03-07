package com.kory0115.release

fun main() {

    var result : Double
    var i = 0

    println("첫번쨰 숫자를 입력해주세요: ")
    var numa: Double = readLine()!!.toDouble()

    println("두번쨰 숫자를 입력해주세요: ")
    var numb: Double = readLine()!!.toDouble()

    while (true) {

        if(i in 1..5 || i == 7) {
            println("다음 숫자를 입력해주세요(값을 초기화하려면 아무 실수나 입력해주세요): ")
            val b: Double = readLine()!!.toDouble()
            numb = b
        } else {
            println("초기화하려면 선택창에서 -1을 눌러주세요")
        }

        println("1.+, 2.-, 3.*, 4./, 5. %, -1.초기화, 6.종료: ")
        i = readLine()!!.toInt()

        when (i) {
            1 -> {
                //result = Measurement(numa, numb).add()
                result = AddOperation(numa, numb).add()
                println("$numa + $numb = $result")
                numa = result
            }
            2 -> {
                result = SubstractOperation(numa, numb).sub()
                println("$numa - $numb = $result")
                numa = result
            }
            3 -> {
                result = MultiplyOperation(numa, numb).mul()
                println("$numa * $numb = $result")
                numa = result
            }
            4 -> {
                result = DivideOperation(numa, numb).division()
                println("$numa / $numb = $result")
                numa = result
            }
            5 -> {
                result = remainderOperation(numa, numb).remainder()
                println("$numa % $numb = $result")
                numa = result
            }
            -1 -> {
                println("초기화 중입니다.")
                println("첫번쨰 숫자를 입력해주세요: ")
                val a = readLine()!!.toDouble()
                numa = a
                i = 7
            }
            6 -> {
                println("종료 되었습니다.")
                break
            }
        }
    }
}


/*class Calculator {
    var sum = 0.0

    fun add(num1: Int, num2: Int): Double {
        sum = (num1 + num2).toDouble()
        return sum
    }

    fun sub(num1: Double, num2: Int): Double{
        sum = (num1 - num2).toDouble()
        return sum
    }

    fun mul(num1: Double, num2: Int): Double {
        sum = (num1 * num2).toDouble()
        return sum
    }

    fun division(num1: Double, num2: Int): Double {
        sum = (num1 / num2).toDouble()
        return sum
    }
}*/