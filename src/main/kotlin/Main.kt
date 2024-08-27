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
    println("Colors $colors")
    print("Max number of attempts: ")
    val maxNumberAttempts = readln().toInt()
    println("Try to guess the colors!")
    var success = false
    var attempts = 0
    while (attempts < maxNumberAttempts && !success) {
        print("Enter 5 colors separated by comas: ")
        val guessColors = readln().split(",")
        var guess: MutableList<String> = Array(5) {""}.toList().toMutableList()
        guessColors.forEachIndexed { index, color ->
            guess[index] = color.toString()
        }
        println("Guess $guess")
        if (colors == guess) {
            success = true
            println("Congratulations! You guessed the colors!")
        } else {
            attempts++
            println("You have $attempts attempts")
        }
    }

}