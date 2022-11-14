package presentation

import java.util.ArrayList

fun main() {
    val list5 = java.util.ArrayList<String>()
    list5.add("test1")
    list5.add("test2")
    println("${list5.javaClass} $list5")

    val list6 : List<String> = java.util.ArrayList<String>()
    println("${list6.javaClass} $list6")

    val list7 : MutableList<String> = java.util.ArrayList<String>()
    list7.add("test3");
    println("${list7.javaClass} $list7")
}