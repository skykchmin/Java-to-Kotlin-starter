package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

public class JavaFilePrinterKtV1 {

    // 기존 자바에서는 Checked 예와와 Unchecked 예외를 구분한다면 코틀린에서는 구분하지 않는다.
    // 모두 Unchecked 예외이다.
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))

        println(reader.readLine())
        reader.close()
    }


}