
package iterable.list

import java.util.*

fun main(){
    val americano = Coffee("americano", 5000)
    val mix = Coffee("mix", 300)
    val espresso = Coffee("espresso", 4000)

    val list: List<Coffee> = listOf(americano, mix)
    println(list)

    val list2 : List<Coffee> = java.util.ArrayList<Coffee>()


    if(list2 is java.util.List<*>){
        println("test")
    }

    if(list2 is List<*>){
        //list2.add(espresso)
        println("test ${list2}")
    }

    //list2.add(mix)
    println(list2)
}

public fun <T> listOf(element: T): List<T> = Collections.singletonList(element)