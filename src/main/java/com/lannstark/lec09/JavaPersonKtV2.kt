package com.lannstark.lec09

fun main(){
    val person = JavaPersonKtV2("최태현", 100)
    println(person.age) // getAge 대신
    person.age = 10 // setAge 대신
    println(person.age)

    // 자바 필드를 가져올 때도 getter, setter는 안써도 된다
    val person2 = JavaPerson("최태현", 50)
    println(person2.age)
}

class JavaPersonKtV2(val name: String,
                     var age: Int){
}