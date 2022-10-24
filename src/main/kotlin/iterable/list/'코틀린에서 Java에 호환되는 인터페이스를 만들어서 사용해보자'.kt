
package iterable.list

import java.util.*

fun main(){
    val americano = Coffee("americano", 5000)
    val mix = Coffee("mix", 300)
    val espresso = Coffee("espresso", 4000)

    val list: List<Coffee> = listOf(americano)
    println(list)
}

public fun <T> listOf(element: T): List<T> = Collections.singletonList(element)