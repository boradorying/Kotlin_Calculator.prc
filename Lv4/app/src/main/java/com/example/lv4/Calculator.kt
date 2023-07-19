package com.example.lv4

class Calculator {
    fun calcultor(operation: Operation, a: Int, b: Int): Int {
        return operation.calculate(a, b)
    }
}