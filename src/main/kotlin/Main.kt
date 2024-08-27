package org.example

fun main() {
    println("Hello Mastermind!")
    print("Enter 5 colors to guess separated by comas: ")
    val colorsOptions = readln().split(",")
    var colors: MutableList<String> = Array(5) {""}.toList().toMutableList()

    colorsOptions.forEachIndexed { index, color ->
        println("indice: $index, color: $color")
        colors[index] = color.toString()
    }
    println(colors)
}