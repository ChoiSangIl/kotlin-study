package effectiveKotlin.chapter05

fun main() {
    println(factorial(-1))
}

fun factorial(n: Int): Long {
    require(n >= 0)
    return if (n <= 1) 1 else factorial(n - 1) * n
}