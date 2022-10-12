package thread

import java.util.concurrent.CompletableFuture

fun main(){
    val completableFuture = CompletableFuture.supplyAsync(){
        println("async 함수 실행")
        Thread.sleep(2000)
        sum(100, 200)
    }

    println("계산 시작")
    completableFuture.thenApplyAsync(::println) //논블로킹으로 동작
   // val result = completableFuture.get() //블로킹으로 동작

    while (!completableFuture.isDone){
        Thread.sleep(500)
        println("계산 결과를 집계 중입니다.")
    }

    println("계산 종료")
}

fun <T>println(msg: T){
    kotlin.io.println("$msg [${Thread.currentThread().name}]")
}
