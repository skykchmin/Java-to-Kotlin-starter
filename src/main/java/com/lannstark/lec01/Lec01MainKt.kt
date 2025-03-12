package com.lannstark.lec01

class Lec01MainKt {
    var number1 = 10L; // 컴파일러가 자동 추론(타입 삭제 가능)
    val number2: Long = 10L

    var number3: Long? = null

    var person: Person = Person("최태현")
}