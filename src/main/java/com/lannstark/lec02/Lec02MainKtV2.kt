package com.lannstark.lec02

fun main(){
    val str: String? = "ABC"
//    println(str.length) // null 이 들어갈수있기 떄문에 에러
    println(str?.length) // null safe -> null일 경우 null 출력

    val str2: String? = null
    println(str2?.length ?: 0)  // 앞의 연산 결과가 null이면 뒤의 값을 사용
}

/**
 * V2
 */

fun startsWithA1_V2(str: String?): Boolean{
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다");
}

fun startsWithA2_V2(str: String?): Boolean?{
    return str?.startsWith("A")
}

fun startsWithA3_V2(str: String?): Boolean{
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean{
    return str!!.startsWith("A"); // 절대 null이 될 수 없다고 단언할 경우 !! 사용
}
