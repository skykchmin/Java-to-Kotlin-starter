package com.lannstark.lec12

fun main() {

}

class JavaPersonKt private constructor(
    var name: String,
    var age: Int,
){
    // 코틀린에는 static이 없다
    // static: 클래스가 인스턴스화될 떄 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유

    // companion object: 이름을 붙일 수 있다.
    companion object {
        private const val MIN_AGE = 1 // const를 붙이면 컴파일시
        fun newBaby(name: String): JavaPersonKt {
            return JavaPersonKt(name, MIN_AGE)
        }
    }
}