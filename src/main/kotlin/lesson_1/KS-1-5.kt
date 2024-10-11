package org.example.lesson_1

const val SECONDS = 6480
const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60

fun main(){

    val hour: Int = SECONDS / SECONDS_IN_HOUR
    val remainingSec: Int = SECONDS - hour * SECONDS_IN_HOUR
    val minutes: Int = remainingSec / MINUTES_IN_HOUR
    val remainingSeconds: Int = remainingSec - minutes * MINUTES_IN_HOUR

    println(String.format("%02d:%02d:%02d", hour, minutes, remainingSeconds))

}