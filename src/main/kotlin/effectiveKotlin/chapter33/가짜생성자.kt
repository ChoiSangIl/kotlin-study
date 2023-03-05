package effectiveKotlin.chapter33


class A{
    fun println(){
        println("HELLO")
    }
}
fun main(){
    val reference: ()-> A = ::A

    val a = A()
    val b = reference()

    println(a.println())
    println(b.println())

    //가짜 생성자의 대표적인 예
    //실제로 List의 경우는 탑 레벨 함수이다. 하지만 생성자처럼 보일 수도 있다. 이래서 가짜생성자라고도 불림
    val list = List(4){"User $it"}
    println(list)
}