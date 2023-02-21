package classes

fun throwError(): Nothing = throw Exception("예외 발생")

fun main(){

    val result = try{
        throwError()
    } catch (e: Exception){
        println(e.message)
        "기본값"
    }

    val result1 = runCatching { throwError() }
        .getOrElse {
            println(it.message)
            "DEFAULT"
        }

    println(result1)

    val result2 = runCatching { throwError() }
        .getOrNull()

    println(result2)

    val result3 = runCatching { throwError() }
        .exceptionOrNull()

    /*
    result3?.let{
        println(it.message)
        throw it
    }
    */

    val result4 = runCatching { throwError() }
        .getOrDefault("DEFAULT")

    println(result4)

    /*
    val result5 = runCatching { throwError() }
        .getOrThrow()

    println(result5)
     */

    val result6 = runCatching { "hello" }
        .map { "$it world" }
        .getOrThrow()

    println(result6)

    val result7 = runCatching { "hello" }
        .map { "$it world" }
        .getOrDefault("DEFAULT")

    println(result7)

    val result8 = runCatching { throwError() }
        .recover { "recover" }
        .getOrNull()

    println(result8)

    val result9 = runCatching { throwError() }
        .recoverCatching { throwError() }
        .getOrDefault("DEFAULT")

    println(result9)
}