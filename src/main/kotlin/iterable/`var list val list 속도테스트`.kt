package iterable

import kotlin.system.measureTimeMillis


fun main() {
    val dot = "."
    val elapsed: Long = measureTimeMillis {
        var str = ""
        repeat(1_000_000) {
            str += dot
        }
        println("length: ${str.length}")
    }
    println("elapsed: $elapsed")
}