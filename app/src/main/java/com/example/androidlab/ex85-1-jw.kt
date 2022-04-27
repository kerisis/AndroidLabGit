package com.example.androidlab

//val data85_jw_1_1 : Int;        //최상위에 선언한 변수, 클레스의 멤버 변수는 선언과 동시에 초기값을 할당 해야됨
val data85_jw_1_2 = 20;

fun main(){
    val data85_jw_1_3 : Int;
    //println("data85_jw_1_3 :  $data85_jw_1_3");   //함수내부의 변수는 선언과 동시에 초기값을 할당 해도 되지 않지만 이용할려면 값을 할당 해야됨
    data85_jw_1_3 = 10;
    println("data85_jw_1_3 :  $data85_jw_1_3");
}

class User {
    //val data85_jw_1_4: Int;         //클레스 내부의 멤버변수는 선언과 동시에 값을 할당 해야됨
    val data85_jw_1_5: Int = 10;
}