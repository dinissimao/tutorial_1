package org.example.cm.exer_3

fun main() {
    val bounces = generateSequence(100.0) { it * 0.6 }
        .takeWhile { it >= 1.0 } // Filtra os saltos que são maiores ou iguais a 1 metro
        .take(15) // Pega os primeiros 15 saltos qualificados

    bounces.toList().forEach { println(String.format("%.2f", it)) }
}