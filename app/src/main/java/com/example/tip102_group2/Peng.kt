package com.example.tip102_group2

fun mcdonald(){
    val ha = "hahahahah"
    println("嗨嗨")
    println(ha)
}

var name: String = "PENG"

fun main() {
    println(name)
    changeName()
    println("${changeName()}")
    mcdonald()
}

fun changeName() {
    name = "CHEN"
}