package com.lannstark.lec03

fun main(){
    val number1 = 3
    val number2: Long = number1.toLong() // 명시적으로 타입 변환을 할 때 toXXX로 해줘야한다.

    printAgeIfPerson1(Person("Person1", 10))

    printAgeIfPerson2(Person("", 100))
    printAgeIfPerson2(null)

    printPartString("ABC")
}

fun printAgeIfPerson1(obj: Any) {
    if(obj is Person){
        val person = obj as Person // (Person) 타입 캐스팅과 같은 의미
        println(person.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    if(obj is Person){
        val person = obj as? Person // (Person) 타입 캐스팅과 같은 의미
        println(person?.age)
    }
}

fun printPartString(str: String){
    println(str[0]) // "A"
    println(str[2]) // "C"
}