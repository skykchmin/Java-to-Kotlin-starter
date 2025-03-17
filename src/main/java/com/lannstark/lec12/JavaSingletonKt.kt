package com.lannstark.lec12

fun main(){
    JavaSingletonKt.a // Singleton은 하나이기 때문에 바로 접근 가능
}

// 싱글톤
object JavaSingletonKt {
    var a: Int = 0
}