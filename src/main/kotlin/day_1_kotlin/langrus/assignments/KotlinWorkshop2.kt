@file:Suppress(
    "UNREACHABLE_CODE",
    "DuplicatedCode",
    "UNUSED_VARIABLE",
    "ControlFlowWithEmptyBody",
    "ConstantConditionIf"
)

package day_1_kotlin.langrus.assignments

import java.util.*
import kotlin.random.Random

// Практическая работа #2 - control flow (if, when), arrays, for loop, if expression, return & jumps

object KotlinWorkshop2 {

    // Запусти исполнение main() функции, для выполнения кода.
    // См. подробнее в /../info/B_HowToRunProgram
    @JvmStatic
    fun main(args: Array<String>) {

        val upperBound = getUpperBound()
        val nonNullUpperBound = upperBound ?: 10
        val randomNumber = Random.nextInt(nonNullUpperBound)
        val scanner = Scanner(System.`in`)

        while (true) {
            print("Введите число в диапазоне 0..$nonNullUpperBound включительно: ")
            // Сохраняем введённое с клавиатуры число в "userInput".
            val userInput: Int = scanner.nextInt()
            if (userInput == randomNumber) {
                    break
                println("Поздравляю! Задуманное число х")
                }
            else if (userInput >= randomNumber) {
                println("Ваше число больше задуманного, пожалуйста продолжаем.")
            }
            else if (userInput <= randomNumber) {
                println("Ваше число меньше задуманного, пожалуйста продолжаем.")
            }
        }
        val numbersArray = arrayOf(10,20,30,40,50)
        println("\n Программа 2. \"Введите коллекцию чисел\"")
        val size = numbersArray.size
        var counter = 0
        while (counter < size) {
            print("Введите число в диапазоне 0..10 включительно: ")
            when (val userInput: Int = scanner.nextInt()){
                3 -> numbersArray.set(counter, userInput)
                5 -> numbersArray.set(counter, userInput * size)
                9 -> numbersArray.set(counter, 2 + size)
                else -> { /* ignored */ }
            }

            counter++
        }

        for ((index, value) in numbersArray.withIndex()){
            println("Cell #$index: value is $value")
        }
    }


    private fun getUpperBound(): Int? {
        println("Программа 1. \"Угадай число\"")
        print("Введите число максимум в диапазоне 10..20 включительно: ")
        val scanner = Scanner(System.`in`)
        return try {
            scanner.nextInt()

        } catch (e: InputMismatchException) {
            null
        }
    }
}