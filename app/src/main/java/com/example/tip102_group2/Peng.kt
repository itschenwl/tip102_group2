package com.example.tip102_group2

fun Mcdonald(){
    val ha = "hahahahah"
    println("嗨嗨")
}

var name: String = "PENG"

fun main() {
    println("$name")
    changeName()
    println("${changeName()}")
    println("${Mcdonald()}")
}

fun changeName() {
    name = "CHEN"
}