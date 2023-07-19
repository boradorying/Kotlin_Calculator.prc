package com.example.lv4

class Quo : Operation() {
    override fun calculate(a: Int, b: Int): Int {
        return a % b
    }
}