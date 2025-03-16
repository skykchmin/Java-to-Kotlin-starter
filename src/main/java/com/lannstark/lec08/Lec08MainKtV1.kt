package com.lannstark.lec08

fun main(){
    repeat("Hello world")

    // builder를 직접 만들지 않고, builder의 장점을 가지게 된다
    printNameAndGender(name = "최태현", gender = "MALE")
}

fun max(a: Int, b: Int): Int =
    if(a > b){
        a
    } else {
        b
    }

// default parameter 사용
fun repeat(str: String,
           num: Int = 3,
           useNewLine: Boolean = true) {
    for(i in 1..num){
        if(useNewLine){
            println(str)
        } else {
            println(str)
        }
    }
}

// named argument
// 매개변수 이름을 통해 직접 지정, 지정되지 않은 매개변수는 기본값 사용
// builder를 직접 만들지 않고, builder의 장점을 가지게 된다

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

