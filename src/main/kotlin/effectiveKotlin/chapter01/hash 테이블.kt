package effectiveKotlin.chapter01

import java.util.*


fun main() {
    val person = FullName("AAA", "BBB")

    val names: SortedSet<FullName> = java.util.TreeSet<FullName>()
    names.add(person)
    println(names)

}

data class FullName(
    var name: String,
    var surname: String
)