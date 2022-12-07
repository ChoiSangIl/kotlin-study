package iterable.list

fun main() {
    val list1 = listOf("a", "b", "c");
    println(list1)

    val list2 = list1.map { it.uppercase() }
    println(list2)
}