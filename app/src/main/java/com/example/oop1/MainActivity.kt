package com.example.oop1

import kotlin.random.Random

fun main() {
//     val listOfNumber = mutableListOf<Int>()
//        for (i in 0..99) {
//            listOfNumber.add(i)
//        }
//    val listOfEvenNumber = listOfNumber.filter { it % 2 ==0}
//    for (i in listOfEvenNumber) {
//        println(i)
//    }

//    val listOfNames = mutableListOf("Arina", "Pavel", "Gayorgay", "Genna", "Valentino")

//    val listOfANames = listOfNames.filter { it.startsWith("A") }

//    val number = (0..100).toList()
//    val doubledNumbers = number.map { it * 2 }
//    val employees = number.map { "Employee $it" }


//    val array = arrayOf(8, 34,13,5,43, 2323)
//    val sortedArray = array.sortedArray()

    val arrrList = mutableListOf<Int>()
    for (i in 0..1000)
        arrrList.add(Random.nextInt(1000))
    val newListarrr = arrrList.filter { it % 3 == 0 || it % 5 == 0 }.map { it * it }.sortedDescending().map { "$it" }

    println(newListarrr)


}
