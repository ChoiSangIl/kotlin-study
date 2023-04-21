package effectiveKotlin.chapter01

import java.util.*


fun main() {
    val person = FullName("AAA", "AAA")

    val names: HashSet<FullName> = HashSet()

    names.add(person)
    println(names)

    names.add(FullName("BBB","BBB"))
    names.add(FullName("CCC","CCC"))

    person.name = "ZZZ"
    println(person in names)
}

data class FullName(
    var name: String,
    var surname: String
)