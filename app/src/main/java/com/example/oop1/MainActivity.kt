package com.example.oop1

import kotlin.math.absoluteValue
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

//    val arrrList = mutableListOf<Int>()
//    for (i in 0..1000)
//        arrrList.add(Random.nextInt(1000))
//    val newListarrr = arrrList.filter { it % 3 == 0 || it % 5 == 0 }.map { it * it }.sortedDescending().map { "$it" }

//    println(newListarrr)

//    val array = (0..1000).toList()
//    val employee = array.map { "Employee №$it" }
//    val first30 = employee.take(30)
//    val last30 = employee.takeLast(30)
//    val drop30 = employee.drop(954)
//    val dropLast30 = employee.dropLast(971)


    //Бесконечный массив
//    var arrayEndless = generateSequence(0) {
//        println("Generate:${it + 2}")
//        it + 2 }
//    val evenList = arrayEndless.take(100)
//    println(evenList.joinToString())

    // beskonechnii massiv bukovok

//    var arrayEndlessA = generateSequence('A') {
//        println("Generate:${it + 1}")
//        it + 1 }
//    val evenListA = arrayEndlessA.take(15)
//    println(evenListA.joinToString())


    // beskomechnii massiv random number ot 0 do 100
//    val arrayRandom = generateSequence {
//        (Math.random() * 100).toInt()
//    }
//    val array2 = arrayRandom.take(10)
//    println(array2.joinToString())

//
//    val employee1 = generateSequence(1   ) { it + 1}
//    val employee2 = employee1.take(100).map { "Employee #$it" }
//    println(employee2.joinToString())



//    // ZIP function
//    val names = mutableListOf<String>()
//        for (i in 0..1000) {
//            names.add("Name$i")
//        }
//
//    val numbers = (79992290000..79992300000).toMutableList()
//
//    val users = names.zip(numbers)
//    for (user in users) {
//        println("Name: ${user.first} phone: ${user.second}")


//    val firstName = mutableListOf<String>()
//        for (i in 0..1000)
//            firstName.add("FirstName$i")
//
//    val lastName = mutableListOf<String>()
//        for (i in 0..1000)
//            lastName.add("LastName$i")
//
//    val names = firstName.zip(lastName)
//
//    // OR
//    val fullName = mutableListOf<String>()
//    for (i in 0..1000) {
//        fullName.add("firstName$i lastName$i")
//    }
//    val imya = fullName.map { it.substringBefore(" ") }
//    val familiy = fullName.map { it.substringAfter(" ") }
//    val users = imya.zip(familiy)
//    println(users.joinToString())
////    for (user in users)
////    println("${user.first}  ${user.second}")z
//
//    val usersOOP = fullName.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }

//    val revenueByWeek = listOf(
//        listOf(8,6,5,1,2),
//        listOf(8,7,5,9,2),
//        listOf(8,5,5,1,3),
//        listOf(1,6,5,1,2)
//    )
//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }
//    val average = total.average()
//
//    // OR
//    val total1 = revenueByWeek.flatMap { it } // or revenueWeek.flatter { it }
//    val average1 = total1.average()



    // MAP
//    val data = mutableMapOf<String, List<Int>>()
//    data.put("file1", listOf(13, 20,33,44, 55))
//    data.put("file2", listOf(14, 22,35,-443, 355))
//    data.put("file3", listOf(1, 20,63,45, 54))
//    // Better to do
//    val data1 = mapOf(
//        "file1" to listOf(13, 20,33,44, 55),
//        "file2" to listOf(14, 22,35, -443, 355),
//        "file3" to listOf(1, 20,63,45, 54)
//    )
//    val average = data.flatMap { it.value }.average()
//    println(average)
//    val averageMore0 = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
//    println(averageMore0)



    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    //printInfo(data)
//    val averageWeek = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
//    println("Average week revenue: $averageWeek")
//    val monthMoreThan0 = data.filter { it.value.all { it >= 0 } }.keys.size
//    val averageMonth = averageWeek * monthMoreThan0
//    println("Average month revenue: $averageMonth")
//    val maxRevenue = data.filter { it.value.all { it >= 0 } }.map { it.value.sum() }
//    val maxByWeek = maxRevenue.max()
//    val minByWeek = maxRevenue.min()
//    val maxMonth = data.filter { it.value.all { it >= 0 } }.filter { it.value.sum() == maxByWeek }.keys
//    val minMonth = data.filter { it.value.all { it >= 0 } }.filter { it.value.sum() == minByWeek }.keys
//    println(maxByWeek)

    val validData = data.filter { it.value.all { it >= 0 } }
    val avarageWeek = validData.flatMap { it.value }.average()

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum() == max }
    val minMonth = validData.filter { it.value.sum() == min }

    println(listOfSum)








}
