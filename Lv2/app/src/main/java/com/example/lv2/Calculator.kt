package com.example

//                       Lv2

fun main() {
    println("첫번째 숫자를 입력하세요")
    val number1 = readLine()?.toIntOrNull()
    println("두번째 숫자를 입력하세요")
    val number2 = readLine()?.toIntOrNull()
    println("연산자를 입력하세요")
    val operator = readLine()
    if (number1 != null && number2 != null && operator != null) {
        var calculator = Calculator()
        var result = calculator.check(number1, number2, operator)
        println(result)
    } else {
        println("잘못된 연산자입니다")
    }
}
class Calculator {
    fun check(a: Int, b: Int, operator: String): Int {
        return when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            "%" -> a % b
            else -> 0
        }
    }
}