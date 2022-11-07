package iterable.list

fun main() {
    val cities = listOf("Seoul","Tokyo","MountainView")
    println(cities.javaClass) //class java.util.Arrays$ArrayList
    val list = cities.map { str: String -> str.toUpperCase() }
    println(list.javaClass) //class java.util.ArrayList
    //list.add("a") 오류
    val test = mutableListOf<String>("a", "b", "c")
    println(test.javaClass)
    test.add("d")
}