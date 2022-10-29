package effectiveKotlin.chapter01

import kotlin.jvm.internal.markers.KMappedMarker
import kotlin.jvm.internal.markers.KMutableList

val list = listOf(1,2,3)

fun main() {
    // 이렇게 하지 마세요! 아래의 코드처럼 사용필요.
    if (list is MutableList) {
        println(list.javaClass)
        //list.add(4)
    }

    //이렇게 하세요
    val list2 = listOf(1,2,3)
    val mutableList = list2.toMutableList()
    println(mutableList.javaClass)
    mutableList.add(4)
}
