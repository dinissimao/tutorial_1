package org.example.cm.exer_1

fun main() {
    val quadradosA = IntArray(50) { (it + 1) * (it + 1) }
    println("a) IntArray:")
    println(quadradosA.joinToString())

    val quadradosB = (1..50).map { it * it }.toIntArray()
    println("\nb) Range + map():")
    println(quadradosB.joinToString())

    val quadradosC = Array(50) { (it + 1) * (it + 1) }
    println("\nc) Array constructor:")
    println(quadradosC.joinToString())
}