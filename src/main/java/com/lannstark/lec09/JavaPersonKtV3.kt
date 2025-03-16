package com.lannstark.lec09

fun main(){
    val person = JavaPersonKtV3("최태현")

}

class JavaPersonKtV3(
    val name: String,
    var age: Int){

    // 초기화 되는 시점에 한번 호출
    init {
        if(age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    // 추가 생성자
    constructor(name: String): this(name, 1)

    // 커스텀 getter, Setter

    fun isAdult1(): Boolean{
        return this.age >= 20
    }

    val isAdult2: Boolean
        get() = this.age >= 20
}