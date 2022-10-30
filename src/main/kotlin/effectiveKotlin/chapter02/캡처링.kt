package effectiveKotlin.chapter02


fun main() {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while(numbers.isNotEmpty()){
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter {it % prime != 0}
    }
    println(primes)

    // 시퀀스 활용
    val primes2: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1).filter { it % prime != 0 }
        }
    }
    println(primes2.take(10).toList()) // [2,3,5,7,11,13,17,19,23,29]
}

fun caculatePrime(numbers : List<Int>): MutableList<Int> {
    var numbers = numbers.toList()
    val primes = mutableListOf<Int>()

    while(numbers.isNotEmpty()){
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter {it % prime != 0}
    }

    return primes;
}