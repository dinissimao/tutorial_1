package org.example.cm.exer_2

fun main() {

    println("Operação (+, -, *, /, &&, ||, !, shl, shr):")
    val op = readln()

    println("Primeiro número:")
    val a = readln().toInt()

    var b = 0
    if (op != "!") {
        println("Segundo número:")
        b = readln().toInt()
    }

    when (op) {

        "+" -> {
            val r = a + b
            println("Decimal: $r")
            println("Hexadecimal: ${r.toString(16)}")
            println("Boolean: ${r != 0}")
        }

        "-" -> {
            val r = a - b
            println("Decimal: $r")
            println("Hexadecimal: ${r.toString(16)}")
            println("Boolean: ${r != 0}")
        }

        "*" -> {
            val r = a * b
            println("Decimal: $r")
            println("Hexadecimal: ${r.toString(16)}")
            println("Boolean: ${r != 0}")
        }

        "/" -> {
            if (b == 0) {
                println("Erro: divisão por zero")
            } else {
                val r = a / b
                println("Decimal: $r")
                println("Hexadecimal: ${r.toString(16)}")
                println("Boolean: ${r != 0}")
            }
        }

        "&&" -> {
            val r = (a != 0 && b != 0)
            println("Decimal: ${if (r) 1 else 0}")
            println("Hexadecimal: ${(if (r) 1 else 0).toString(16)}")
            println("Boolean: $r")
        }

        "||" -> {
            val r = (a != 0 || b != 0)
            println("Decimal: ${if (r) 1 else 0}")
            println("Hexadecimal: ${(if (r) 1 else 0).toString(16)}")
            println("Boolean: $r")
        }

        "!" -> {
            val r = !(a != 0)
            println("Decimal: ${if (r) 1 else 0}")
            println("Hexadecimal: ${(if (r) 1 else 0).toString(16)}")
            println("Boolean: $r")
        }

        "shl" -> {
            val r = a shl b
            println("Decimal: $r")
            println("Hexadecimal: ${r.toString(16)}")
            println("Boolean: ${r != 0}")
        }

        "shr" -> {
            val r = a shr b
            println("Decimal: $r")
            println("Hexadecimal: ${r.toString(16)}")
            println("Boolean: ${r != 0}")
        }

        else -> {
            println("Operação inválida")
        }
    }
}