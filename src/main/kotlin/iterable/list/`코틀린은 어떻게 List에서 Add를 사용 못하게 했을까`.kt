package iterable.list

//참고 : https://sang12.co.kr/289/
fun main() {
    val americano = Coffee("americano", 5000)
    val mix = Coffee("mix", 300)
    val espresso = Coffee("espresso", 4000)

    //public fun <T> listOf(element: T): List<T> = java.util.Collections.singletonList(element)
    val list: List<Coffee> = java.util.Collections.singletonList(americano);
    //list.add() 사용 못함

    val list2 = java.util.Collections.singletonList(americano);
    //list2.add(mix)  //호출가능 하지만 오류가남 listOf는 넘겨주는 객체가 1개일 때는 singletonList를 사용하기 때문에 오류 발생 java singletonList = 인덱스가 1개일인 리스트

    //여러개의 값을 받는 리스트 선언
    val list3: List<Coffee> = listOf(americano, mix)
    println("${list3.javaClass} $list3") // 출력결과 : class java.util.Arrays$ArrayList [Coffee(name=americano, price=5000), Coffee(name=mix, price=300)] 내부적으로 java ArrayList를 사용하는 것을 알 수 있다.
    //list3.add(espresso) 역시 사용 못함

    val list4 = java.util.Arrays.asList(americano, mix)
    println("${list4.javaClass} $list4")
    //list4.add(espresso) 호출은 가능하지만 오류가남 java의 asList 특성

    val list5 = java.util.ArrayList<Coffee>()
    list5.add(espresso)
    list5.add(mix)
    list5.add(espresso)
    println("${list5.javaClass} $list5")
}

data class Coffee(
    val name : String,
    val price : Int
)