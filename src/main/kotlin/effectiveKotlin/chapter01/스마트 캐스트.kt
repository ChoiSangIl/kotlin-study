package effectiveKotlin.chapter01

val name: String? = "GilDong"
val surname: String = "Hong"

val fullName: String?
    get() = name?.let {"$it $surname"}

val fullName2: String? = name?.let {"$it $surname"}

fun main() {
    if (fullName != null) {
        //println(funllName.length) // 오류
        println(fullName?.length)
    }

    if (fullName2 != null) {
        println(fullName2.length) // 12(Kim GilDong)
    }
}