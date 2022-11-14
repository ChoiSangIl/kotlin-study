package iterable.list

fun main() {
    val cities = listOf("Seoul","Tokyo","MountainView")
    println(cities.javaClass)   //class java.util.Arrays$ArrayList
    //cities.add("a") 오류

    val list: List<String> = cities.map { str: String -> str.toUpperCase() }
    println(list.javaClass)     //class java.util.ArrayList
    //list.add("a")

    val mutableList = mutableListOf<String>("Seoul", "Tokyo", "MountainView")
    println(mutableList.javaClass)     //class java.util.ArrayList
    mutableList.add("a")

}