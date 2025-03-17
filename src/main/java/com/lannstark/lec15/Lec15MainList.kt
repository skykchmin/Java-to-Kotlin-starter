package com.lannstark.lec15

fun main() {
    val array = arrayOf(100, 200)

    array.plus(300) // value를 추가

    for(i in array.indices){
        println("${i} ${array[i]}")
    }

    // 인덱스와 value를 한꺼번에 받는 방법
    for((idx, value) in array.withIndex()){
        println("$idx $value")
    }

    // 코틀린에서는 컬렉션 가변, 불변을 표시해줘야한다.
    // 가변 컬렉션: 컬렉션에 element를 추가 삭제할 수 있다
    // 불변 컬렉션: 컬렉션에 element를 추가, 삭제 할 수 없다. 불변 컬렉션이라 하더라도 레퍼런스 타입인 element의 필드는 바꿀 수 있다.

    val numbers = listOf<Int>(100, 200) // Int 생략 가능
    val emptyList = emptyList<Int>() // emtpyList를 할때는 타입 필수

    // 하나를 가져오기
    println(numbers[0])
    println(numbers.get(0))

    // numbers.add(300) 불변이라 추가 불가

    for (number in numbers){
        println(number)
    }

    // 전통적인 for문
    for((idx, value) in numbers.withIndex()){
        println("$idx $value")
    }

    // 가변
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    for(mutableNumber in mutableNumbers){
        println("mutableNumber: ${mutableNumber}")
    }

    /*
    1. List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
    2. List<Int>? : 리스트에 null이 들어갈 수 없지만, 리스트는 null일 수 있음
    3. List<Int?>? : 리스트에 null이 들어갈 수 있고, 리스트가 null일 수도 있음

     */
}