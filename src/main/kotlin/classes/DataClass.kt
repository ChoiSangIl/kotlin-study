package classes

data class DataClass(val name: String, val age: Int)
class Human(val name:String, val age:Int = 50)

fun main() {
    val hello = DataClass(name="data", age=1)
    val world = DataClass(name="data", age=1)

    if(hello==world){
        println("$hello, $world is same")
    }

    val bart = Human(name="bart", age=20)
    val kim = Human(name="bart", age=20)

    if(bart == kim) println("is same")
    else println("$bart, $kim not same")

    println("hello hash : ${hello.hashCode()} , world hash : ${world.hashCode()}")
    println("bart hash : ${bart.hashCode()} , kim hash : ${kim.hashCode()}")

    //언제쓰지 이런건?
    println("${hello.component1()} - ${hello.component2()}")
}