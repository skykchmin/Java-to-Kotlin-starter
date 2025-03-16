package com.lannstark.lec10

// extends 를 사용하지 않고 : 를 사용한다
// 상위 클래스의 생성자를 바로 호출한다.
// Animal 클래스를 상속받는데 JavaCatKt를 만드는데 species를 받는 생성자가 하나 생기고
class JavaCatKt(
    species: String
) : JavaAnimal(species, 4){

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가")
    }
}