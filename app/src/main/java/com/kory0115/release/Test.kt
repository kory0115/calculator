package com.kory0115.release

abstract class Test() {
    abstract var num1: Double
    abstract var num2: Double
    var sum = 0.0

    open fun add(): Double {
        return sum
    }

    open fun sub(): Double{
        return sum
    }

    open fun mul(): Double {
        return sum
    }

    open fun division(): Double {
        return sum
    }

    open fun remainder(): Double {
        return sum
    }
}

class AddOperation(_number1: Double, _number2: Double) : Test(){
    override var num1: Double = _number1
    override var num2: Double = _number2

    override fun add(): Double {
        sum = num1 + num2
        return sum
    }
}

class SubstractOperation(_number1: Double, _number2: Double) : Test() {
    override var num1: Double = _number1
    override var num2: Double = _number2

    override fun sub(): Double {
        sum = num1 - num2
        return sum
    }
}

class MultiplyOperation(_number1: Double, _number2: Double) : Test() {
    override var num1: Double = _number1
    override var num2: Double = _number2

    override fun mul(): Double {
        sum = num1 * num2
        return sum
    }
}

class DivideOperation(_number1: Double, _number2: Double) : Test() {
    override var num1: Double = _number1
    override var num2: Double = _number2

    override fun division(): Double {
        sum = num1 / num2
        return sum
    }
}

class remainderOperation(_number1: Double, _number2: Double) : Test() {
    override var num1: Double = _number1
    override var num2: Double = _number2

    override fun remainder(): Double {
        sum = num1 % num2
        return sum
    }
}