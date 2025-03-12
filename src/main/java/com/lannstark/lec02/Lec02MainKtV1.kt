package com.lannstark.lec02

fun main(){
    val str: String? = "ABC"
//    println(str.length) // null 이 들어갈수있기 떄문에 에러
    println(str?.length) // null safe -> null일 경우 null 출력

    val str2: String? = null
    println(str2?.length ?: 0)  // 앞의 연산 결과가 null이면 뒤의 값을 사용
}

/**
 * V1
 */

fun startsWithA1(str: String?): Boolean{
    if(str == null){
        throw IllegalArgumentException("null이 들어왔습니다");
    }

    return str.startsWith("A");
}

fun startsWithA2(str: String?): Boolean?{
    if(str == null){
        return null
    }

    return str.startsWith("A");
}

fun startsWithA3(str: String?): Boolean{
    if(str == null){
        return false
    }

    return str.startsWith("A")
}


