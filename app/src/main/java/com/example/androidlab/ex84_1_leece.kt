package com.example.androidlab

val data1 = 10
var data2 = 10

fun main(){
    data1 = 20  //오류!   val은 최초 선언한 ㅕㅂㄴ수만 값으로 이용할 수 있음.
    data2 = 20  //성공!
}