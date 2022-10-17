package iterable

fun main() {
    val list1 = listOf("TEST1", "TEST2")
    var list2 = listOf("TEST1", "TEST2")
    //list1.add immutable add 객체를 사용할 수 없다.
    //list2.add immutable add 객체를 사용할 수 없다.

    val list3: List<String>? = null
    var list4: List<String>? = null

    //list3 = listOf("TEST1", "TEST2") Val cannot be reassigned 재할당 할 수 없다.
    list4 = listOf("TEST1", "TEST2")
}