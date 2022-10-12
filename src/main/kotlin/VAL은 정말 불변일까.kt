open class Human{
    val name
        get() = generateRandomNameForHuman()
}

fun generateRandomNameForHuman(): String{
    val charset = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789"
    return (1..10)
        .map { charset.random() }
        .joinToString("HUMAN")
}

fun generateRandomNameForRobot() : String{
    val charset = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789"
    return (1..10)
        .map { charset.random() }
        .joinToString("ROBOT")
}

fun main(){
    //이펙티브 코틀린 아이템1. 가변성을 제한하라 중 예제
    val list = mutableListOf(1, 2, 3)
    list.add(4)
    println(list)

    //결과값을 보자 정말 불변일까?
    val human = Human()
    println(human.name)
    println(human.name)
    println(human.name)
    println(human.name)
    /**
     * VAL은 읽기 전용 프로퍼티지만, 변경할 수 없음(불변, IMMUTABLE)을 의미하는 것은 아니다! (이펙티브 코틀린)
     */
}

/**
 * var은 게터와 세터를 모두 제공하지만 val은 변경이 불가능하므로 게터만 제공합니다.
 * 그래서 val을 var로 오버라이드 할 수 있습니다.
 */


interface Computer{
    val name: String
}

class SamsungComputer : Computer{
    override var name = "삼성 컴퓨터"
}

