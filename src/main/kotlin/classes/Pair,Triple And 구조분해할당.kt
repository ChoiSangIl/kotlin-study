package classes

data class Tuple(val a: Int, val b: Int)

fun plus(tuple: Tuple) = tuple.a + tuple.b

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main(){
    val plus = plus(Tuple(1,3))
    println(plus)

    val triple = Triple("A", "B", "C")
    println(triple)

    val(a: String, b: String, c: String) = triple
    println("$a $b $c")

    val list = triple.toList()
    val(a1, a2, a3) = list
    println("$a1 $a2 $a3")

    list.component1()
    list.component2()
    list.component3()
    //list.component6()

    val map = mutableMapOf("bart" to "개발자")
    val map2 = mutableMapOf(Pair("bart","개발자"))

    for((key, value) in map){
        println("$key, $value")
    }
}