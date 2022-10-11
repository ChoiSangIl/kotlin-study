package coroutin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * -Dkotlinx.coroutines.debug jvm option에 해당 값 추가하면 어떤 코루틴에서 실행되는지도 알 수 있음.
 */

fun main() = runBlocking {
    launch {
        repeat(5){
            i-> println("Coroutine A, $i")
            delay(10L)
        }
    }

    launch {
        repeat(5){
            i-> println("Coroutine B, $i")
            delay(10L)
        }
    }

    launch {
        repeat(5){
            i-> println("Coroutine C, $i")
            delay(10L)
        }
    }

    println("Coroutine Outer")
}

fun <T>println(msg: T){
    kotlin.io.println("$msg [${Thread.currentThread().name}]")
}
