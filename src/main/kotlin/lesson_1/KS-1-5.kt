package org.example.lesson_1


fun main(){

    val seconds = 6480

    val hour: Int = seconds / 3600

    val remainingSec: Int = seconds - hour * 3600

    val minutes: Int = remainingSec / 60

    val remainingSeconds: Int = remainingSec - minutes * 60

    println(String.format("%02d:%02d:%02d", hour, minutes, remainingSeconds))


}