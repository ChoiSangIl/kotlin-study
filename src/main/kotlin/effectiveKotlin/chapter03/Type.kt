package effectiveKotlin.chapter03

import JavaClass
import User
import UserRepo

fun main() {
    val repo = UserRepo()
    val user1 = repo.user
    val user2: User = repo.user
    val user3: User? = repo.user
    println("${user1.javaClass} ${user2.javaClass} ${user3?.javaClass}")

    //val value:String = JavaClass().value
    //println(value)

    /*
    val value = JavaClass().value
    println(value.length) // 플랫폼 타입을 직접 활용하는 시점에서
    */

}

val DEFAULT_CAR = Fiat126()

interface CarFactory {
    fun produce() = DEFAULT_CAR
}

interface Car

class Fiat126Factory : CarFactory{
    override fun produce(): Fiat126 {
        return Fiat126()
    }
}

class Fiat126 : Car