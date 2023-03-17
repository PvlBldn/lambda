package com.example.oop1

fun main(){
    // lambda
    val sum = {a: Int, b: Int -> a + b}
    val sum1: (Int, Int) -> Int = {a, b -> a + b}
 //   println(sum(2, 10))

    val square: (Int) -> Int = {it * it}
 //   println(square(4))

    val perimeter: (Int, Int) -> Int = {a, b -> (a + b) * 2}

    val name: (String) -> Unit = { println("Privet, $it")}
    name("Pavel")

    val arrayDowt: (Array<Int>) -> Array<Int> = { it.sortedArrayDescending() }
    val arrrrrr = arrayDowt(arrayOf(3, 2, 4,7, 9, 8))
  //  println(arrrrrr.joinToString())

    // FILTER MAP

    val listOfNumber = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumber.add(i)
    }
    val listOfEvenNumbers = listOfNumber.filter { it % 2 == 0 }

    val namesArr = listOf("Arnold", "Arina", "Ariana", "Agata", "Abobus", "Avtobus", "Gosha")
    val namesStartA = namesArr.filter { it.startsWith('A') }
  //  println(namesStartA.joinToString())

    val numberss0100 = (0..100).toList()
    val doublenumberss100 = numberss0100.map { it * 2 }
  //  println(doublenumberss100.joinToString())

    val employeeees = numberss0100.map { "Employee #$it" }
   // println(employeeees.joinToString())

    val arrrrrrrray = arrayOf(1,2,3,4,34,44,33,22)
   // println(arrrrrrrray.sortedArrayDescending().joinToString())





















}