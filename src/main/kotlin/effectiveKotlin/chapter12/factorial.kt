package effectiveKotlin.chapter12

fun Int.factorial() : Int = (1..this).product()

fun Iterable<Int>.product(): Int =
    fold(1) {acc , i->acc*i}

operator fun Int.not() = factorial()

fun main() {
    println(3.factorial())
    //1, 2, 3
    //1 * 1 = 1
    //1 * 2 = 2
    //2 * 3 = 6
    println(!3)
}