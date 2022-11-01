package iterable.list

fun main() {
    val cities = listOf("Seoul","Tokyo","MountainView")
    println(cities.javaClass)
    val list = cities.map { str: String -> str.toUpperCase() }
    println(list.javaClass)

    val test = mutableListOf<String>("a", "b", "c")
    println(test.javaClass)
    test.add("d")
}