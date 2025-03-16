package com.lannstark.lec06

fun main(){
    val numbers: List<Long> = listOf(1L, 2L, 3L)

    // 1. forEach
    for(number in numbers){
        println(number)
    }

    // 전통적인 for문
    for(i in 1..3){ //
        println(i)
    }

    for(i in 3 downTo 1){
        println(i)
    }
}