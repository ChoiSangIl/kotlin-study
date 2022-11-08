package iterable.list

fun main() {
    val cities = listOf("Seoul","Tokyo","MountainView")
    println(cities.javaClass)   //class java.util.Arrays$ArrayList

    val list = cities.map { str: String -> str.toUpperCase() }
    println(list.javaClass)     //class java.util.ArrayList
    //list.add("a") 오류

    val mutableList = mutableListOf<String>("a", "b", "c")
    println(mutableList.javaClass)     //class java.util.ArrayList
    mutableList.add("d")
}