package classes

data class Tuple(val a: Int, val b: Int)

fun plus(tuple: Tuple) = tuple.a + tuple.b

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main(){
    val plus = plus(Tuple(1,3))
    println(plus)

    val triple = Triple("A", "B", "C")
    println(triple)
}