package coroutin

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * -Dkotlinx.coroutines.debug jvm option에 해당 값 추가하면 어떤 코루틴에서 실행되는지도 알 수 있음.
 */

fun main() = runBlocking {
    count2()
    println("Done")
}

suspend fun count2() = coroutineScope {
    launch {
        repeat(5){i ->
            delay(1000L)
            println("Coroutine A, $i")
        }
    }

    launch {
        repeat(5){i ->
            delay(1000L)
            println("Coroutine B, $i")
        }
    }

    println("Coroutine Outer")
}


