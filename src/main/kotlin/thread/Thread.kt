
fun main(){
    for (i in 0 .. 5){
        val thread = Thread(Runnable{
            println("thread name :  ${Thread.currentThread().name}")
        })
        thread.start()
    }
}