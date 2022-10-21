package iterable

fun main() {
    val list1 = listOf("TEST1", "TEST2")
    var list2 = listOf("TEST1", "TEST2")
    //list1.add immutable add 객체를 사용할 수 없다.
    //list2.add immutable add 객체를 사용할 수 없다.

    list2 = list2.plus("TEST3")
    println("list1: $list1 list2: $list2")

    val list3: List<String>? = null
    var list4: List<String>? = null

    //list3 = listOf("TEST1", "TEST2") Val cannot be reassigned 재할당 할 수 없다.
    list4 = listOf("TEST1", "TEST2")

    val list5 = mutableListOf(1)
    var list6 = listOf(1)

    list5.add(2)
    list6 = list6 + 2
    println("list5: $list5 list6: $list6")

    list5 += 3  //list5.plusAssign(3)로 변환
    list6 += 3  //list6 = list6.plus(3)로 변환

    println("list5: $list5 list6: $list6")

    list5.plusAssign(4)
    list6 = list6.plus(4)

    println("list5: $list5 list6: $list6")
}