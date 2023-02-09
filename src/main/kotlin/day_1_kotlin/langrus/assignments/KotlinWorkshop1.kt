@file:Suppress(
    "UNREACHABLE_CODE",
    "DuplicatedCode",
    "UNUSED_VARIABLE",
    "ControlFlowWithEmptyBody",
    "ConstantConditionIf",
    "RedundantNullableReturnType",
    "RedundantExplicitType",
    "unused"
)

package day_1_kotlin.langrus.assignments

import java.util.*

// Практическая работа #1 - val, var, null, kotlin null безопасность, Элвис оператор

object KotlinWorkshop1 {

    @JvmStatic
    fun main(args: Array<String>) {

        // Инициализация переменных. Обрати внимание, они могут принимать значение null.
        // Не исправляй! Дано:
        val nullableElvisString: String? = null
        val nullableAssertionString: String? = "потенциально null"
        val emptyString = ""


        var notNullUserString: String = nullableElvisString ?: emptyString
        println("Строка результат равна $notNullUserString")


        notNullUserString = nullableAssertionString!!
        println("Строка результат равна $notNullUserString")


        val notNullAlternative = 0
        val firstNumber: Int? = 10
        val secondNumber: Int? = 20
        val sum: Int? = firstNumber?.plus(secondNumber ?: notNullAlternative)
        println("Сумма равна {$sum}")


        print("Пожалуйста введите строку: ")
        val stringInput: String? = MyScanner.scan.next() // <--- string input 1


        print("Пожалуйста введите первое число: ")
        val firstIntInput: Int? = MyScanner.scan.nextInt() // <--- вводим первое число
        print("Пожалуйста введите второе число: ")
        val secondIntInput: Int? = MyScanner.scan.nextInt() // <--- вводим второе число
        val sumIntInputs : Int? = firstIntInput?.plus(secondIntInput ?: notNullAlternative) // <--- делаем замену потенциального 'null' значением по умолчанию
        println("Исходная строка: $stringInput, Сумма чисел: $sumIntInputs")


        val number: Int = -1
        val someNumber: Double = 2.5
        val someString: String = "Привет, мир!"
        val someFlag: Boolean = true
        var someNullableNumber: Long? = null
    }
}




class MyScanner {
    companion object {
        val scan = Scanner(System.`in`)
    }
}