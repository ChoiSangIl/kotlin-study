package effectiveKotlin.chapter38


fun main() {
    val func1: () -> Unit = { println("Hello") }
    println(func1())

    val func2: () -> String = { "Hello" }
    println(func2())

    val list = mutableListOf(printHello)
    list[0]()

    val func3 = list[0]
    func3()

    call(printHello)

    val list1 = listOf(1, 2, 3, 4, 5)
    list1.forEach(::println)
    list1.forEach{
        println(it)
    }
    // run, with, also, let, takeIf 결국 함수 타입이다.
    list1.apply { }


    val list2 = listOf("a", "b", "c", "d", "e")
    val upperCase: (String) -> String = { it.uppercase() }
    list2.map(fun(it: String): String {
        return it.uppercase()
    })

    list2.map { it.uppercase() }

    val printStr: (String) -> Unit = { println(it) }
    forEachStr(list2, printStr)

    list2.forEach(::println)

    outerFunc()()
    val func = outerFunc()
    func()

    forEachStr(list2){
        println(it)
    }
}

/*
fun outerFunc() : () -> Unit {
    /*
    return fun(){
        println("이것은 익명함수!")
    }
     */
    return {println("이것은 익명함수!")}
}
 */

val sum: (Int, Int) -> Int = { x, y -> x + y }
fun outerFunc(): () -> Unit = { println("이것은 익명함수!") }

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) action(item)
}

val printMessage: (String) -> Unit = { message -> println(message) }

fun printlnHello2() {
    println("hello2")
}

val printHello: () -> Unit = { println("Hello") }

//함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}