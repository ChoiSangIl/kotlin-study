package iterable

fun main(){

    /**
     * kotlin List var
     */
    lateinit var apples : List<Apple>

    val apple1 = Apple(1, 10)
    val apple2 = Apple(2, 20)
    val apple3 = Apple(3, 5)

    apples = listOf(apple1)
    apples += apple2
    apples = apples.plus(apple3)

    println("java type : ${apples.javaClass} list : $apples")

    //#############################################################

    /**
     * Kotlin List val
     */
    val americano = Coffee("americano", 5000)
    val mix = Coffee("mix", 300)
    val espresso = Coffee("espresso", 4000)

    val coffees = listOf(americano, mix)
    println(coffees)

    /**
     * coffees = coffees.plus(espresso)
     * Val cannot be reassigned 오류 발생
     * 당연하게도 coffees.plus는 새로운 객체를 반환 하는데
     * val은 읽기 전용 이므로 변경 되지 않는다.
     */

    val coffees2 = coffees.plus(espresso)
    println(coffees2)

    //그런데 어떻게 코틀린에서는 Java의 Class를 사용 하는데 add를 사용 할 수 없을까?
    //public fun <T> listOf(element: T): List<T> = java.util.Collections.singletonList(element)
    val list : List<Coffee> = java.util.Collections.singletonList(americano);
    //list.add() 사용 못함
    var list2 = java.util.Collections.singletonList(americano);
    list2.add(mix)  //하지만 오류가남 listOf는 넘겨주는 객체가 1개일 때는 singletonList를 사용하기 때문에 오류 발생 java singletonList = 인덱스가 1개일인 리스트

}

/*
public operator fun <T> Collection<T>.plus(element: T): List<T> {
    val result = ArrayList<T>(size + 1)
    result.addAll(this)
    result.add(element)
    println("plus 호출됨 $result")
    return result
}
 */

data class Apple(
    val id : Long,
    val weight : Long
)

data class Coffee(
    val name : String,
    val price : Int
)
