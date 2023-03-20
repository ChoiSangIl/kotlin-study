package effectiveKotlin.chapter35

fun main(){
    val int = 1
    println (int.myPlus(2))

    val myPlus = fun Int.(other: Int) = this + other

    println(myPlus(1, 2))
    println(myPlus.invoke(1, 2))
    println(1.myPlus(2))

    println(createTable().toString())
}

fun Int.myPlus(other: Int) = this + other

fun createTable() = table{
    tr{
        for(i in 1..2){
            td{
                +"this is column $i"
            }
        }
    }
}

fun table(init: TableBuilder.()->Unit): TableBuilder {
    val tableBuilder = TableBuilder()
    init.invoke(tableBuilder)
    return tableBuilder
}

class TableBuilder{
    fun tr(init: TrBuilder.()->Unit){/*...*/}
}

class TrBuilder{
    fun td(init: TdBuilder.()->Unit){/*...*/}
}

class TdBuilder{
    var text = ""

    operator fun String.unaryPlus(){
        text += this
    }
}