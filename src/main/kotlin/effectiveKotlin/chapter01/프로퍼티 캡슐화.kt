package effectiveKotlin

fun calculate(): Int{
    println("Calculating...")
    return 42
}

val fizz = calculate()
val buzz
    get() = calculate()

fun main(){
    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)
}