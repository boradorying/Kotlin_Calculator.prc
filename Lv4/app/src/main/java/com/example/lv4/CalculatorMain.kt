package com.example.lv4





//       Lv4 입니다d

fun main() {

    println("첫번째 숫자를 입력하세용")
    val number1: Int? = readLine()?.toIntOrNull()
    println("두번째 숫자를 입력하세용")
    val number2: Int? = readLine()?.toIntOrNull()

    println("+, -, *, /, % 연산자를 입력하세영")
    val operator: String = readLine()?.trim() ?: ""
    if (number1 != null && number2 != null) {
        val operation = Calculator()


        val result = when (operator) {
            "+" -> operation.calcultor(Add(), number1, number2)
            "-" -> operation.calcultor(Minus(), number1, number2)
            "*" -> operation.calcultor(Multi(), number1, number2)
            "/" -> operation.calcultor(Division(), number1, number2)
            "%" -> operation.calcultor(Quo(), number1, number2)
            else -> {
                println("잘못된 연산자를 입력하셨어요")
                0
            }
        }
        println("결과: ${result}")
    }
}