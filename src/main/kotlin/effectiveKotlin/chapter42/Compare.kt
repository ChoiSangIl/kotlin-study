package effectiveKotlin.chapter42

fun main(){
    val users = listOf(User("John", "Doe"), User("Jane", "Smith"), User("Foo", "Bar"))
    println(users.sorted())
}

class User(val name: String, val surname: String) : Comparable<User> {

    override fun compareTo(other: User): Int = compareValuesBy(this, other, User::surname, User::name)

}

fun <T> compareValuesBy(a: T, b: T, vararg selectors: (T) -> Comparable<*>?): Int {
    require(selectors.size > 0)
    return compareValuesByImpl(a, b, selectors)
}

fun <T> compareValuesByImpl(a: T, b: T, selectors: Array<out (T) -> Comparable<*>?>): Int {
    for (fn in selectors) {
        val v1 = fn(a)
        println("$fn  $a")  //뭐지이거
        val v2 = fn(b)
        val diff = compareValues(v1, v2)
        if (diff != 0) return diff
    }
    return 0
}
