package com.example.lv3




//  Lv3



fun main() {
    println("첫번째 숫자를 입력하세요")
    val number1 = readLine()?.toIntOrNull()
    println("두번째 숫자를 입력하세요")
    val number2 = readLine()?.toIntOrNull()
    println("연산자를 입력하세요 (+, -, *, /, %)")
    val operator = readLine()?.trim()

    if (number1 != null && number2 != null && operator != null) {
        val calculator = Calculator()
        val result = calculator.calculate(operator, number1, number2)
        println("결과: $result")
    } else {
        println("잘못된 입력입니다")
    }
}




class Calculator {
    fun calculate(operation: String, a: Int, b: Int): Int {
        return when (operation) {
            "+" -> Add().calculate(a, b)
            "-" -> Minus().calculate(a, b)
            "*" -> Multi().calculate(a, b)
            "/" -> Division().calculate(a, b)
            "%" -> Quo().calculate(a, b)
            else -> {
                println("잘못된 연산자입니다")
                0
            }
        }
    }
}