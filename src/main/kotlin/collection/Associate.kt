package collection

class Person(
    val name: String,
    val age: Int
)

fun main(){
    val list = listOf(Person("test", 1), Person("test2", 2), Person("test3", 3), Person("test4", 4))

    val map1 = list.associate { it.name to it.age }
    val map2 = list.associate { Pair(it.name, it.age) }

    println("${map1["test"]}, ${map2["test4"]}")
}