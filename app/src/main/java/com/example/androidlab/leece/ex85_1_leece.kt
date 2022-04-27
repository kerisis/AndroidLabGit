package com.example.androidlab

val ex85_data: Int = 10
val ex85_data2 = 10



val data1: Int  // 오류
val data2 = 10  // 성공!

fun someFun() {
    val data3: Int           //  fun 에서는 초기값을 할당하지 않아도 됨.
    println("data3 : $data3")
    data3 = 10
    println("Data3 : $data3") // 성공
}


class User{
    val data4: Int // 오류!
    val data5: Int = 10 // 성공!
}