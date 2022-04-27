package com.example.androidlab

val data1 = 10;
var data2 = 20;

fun main(){
    data1 = 20;     //val은 최초로 선언한 값에서 변경 안됨
    data2 = 20;
}