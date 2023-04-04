package effectiveKotlin.chapter37

data class Test(
    val one: Int,
    val two: Int,
    val three: Int,
    val four: Int,
    val five: Int,
    val six: Int,
    val seven: Int,
    val eight: Int,
    val nine: Int,
    val ten: Int,
    val eleven: Int
)
fun main(){
    val test = Test(
        1,2,3,4,5,6, 7,8,9,10, 11
    )
    //val (one, two, three, four, five, six, seven, eight, nine, ten, eleven) = test
    //println("$one, $two, $three, $four, $five, $six, $seven, $eight, $nine, $ten, $eleven")

    val list = listOf(1,2,3,4,5,6,7,8,9,10,11)
    list.component1()
    list.component2()
    list.component3()
    list.component4()
    list.component5()

    
    val map1 = mapOf("Bart" to "개발자")
    val map2 = mapOf(Pair("Bart","개발자"))
    println("$map1 $map2")
}