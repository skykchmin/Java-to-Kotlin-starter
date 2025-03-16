package com.lannstark.lec10

class JavaPenguinKt(
    species: String
) : Animal(species, legCount = 2), JavaSwimableKt, JavaFlyableKt{

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꽥꽥")
    }

    // 커스텀 getter
    // 코틀린에서는 java랑 다르게 property를 override할 때 무조건 open을 붙여줘야한다. (추상 프로퍼티가 아니라면, 상속 받을 때 open을 꼭 붙여줘야한다)
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act(){
        super<JavaSwimableKt>.act()
        super<JavaFlyableKt>.act()
    }
}