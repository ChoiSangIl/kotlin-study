class Node<T>(val value: T, val next: () -> Node<T>)

fun main() {
    /**
     * 코틀린 공식 doc https://kotlinlang.org/docs/whatsnew12.html#lateinit-top-level-properties-and-local-variables
     */
    // A cycle of three nodes:
    lateinit var third: Node<Int>

    val second = Node(2, next = { third })
    val first = Node(1, next = { second })

    third = Node(3, next = { first })

    val nodes = generateSequence(first) { it.next() }
    println("Values in the cycle: ${nodes.take(7).joinToString { it.value.toString() }}, ...")
    // ended....

    lateinit var name: String

    //do something...

    name = "ChoiSangIl"
    println(name)
}