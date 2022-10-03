package thread

import java.time.LocalTime
import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun sum1(a: Int, b: Int): Int {
    println(Thread.currentThread().name)
    Thread.sleep(5000)
    return a + b
}

fun sum2(a: Int, b: Int): Int {
    println(Thread.currentThread().name)
    Thread.sleep(10000)
    return a + b
}

fun main(){
    println(LocalTime.now())

    val pool1 = Executors.newSingleThreadExecutor()
    val pool2 = Executors.newSingleThreadExecutor()

    val future1 = pool1.submit(Callable { sum1(100, 200)})
    val future2 = pool2.submit(Callable { sum2(100, 200)})

    /**
     * Future의 단점?
     * 외부에서 완료시킬 수 없고, GET의 타임아웃으로만 가능하다.
     * 블록킹 되는 코드 GET을 통해서만 이후의 결과를 처리 할 수 있다.(GET 이후의 후처리 코드들이 있어야 한다)
     */
    println("계산시작")

    val futureResult1 = future1.get() //비동기 작업의 결과를 기다린다.
    val futureResult2 = future2.get() //비동기 작업의 결과를 기다린다.
    println(futureResult1 + futureResult2)

    println("계산 종료")
    println(LocalTime.now())
    /**
     * 결과값
     * 21:28:44.536328500
     * pool-1-thread-1
     * 계산시작
     * pool-2-thread-1
     * 600
     * 계산 종료
     * 21:28:54.540495700
     */
}