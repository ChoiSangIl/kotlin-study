package coroutin

import kotlinx.coroutines.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


fun main() {
    for(i in (1..100)){
        test()
    }
    Thread.sleep(1000000)
}


fun test(){
    CoroutineScope(Dispatchers.IO).launch {
        println("start ${Thread.currentThread().name}")
        getApi()
        println("end ${Thread.currentThread().name}")
    }
}

/**
 * Spring 에서 @Async 로 되어 잇는 비동기 API
 */
fun getApi()
{
    try {
        val apiURL = "http://localhost:8080/spring-async"
        val url = URL(apiURL)
        val con: HttpURLConnection = url.openConnection() as HttpURLConnection
        con.setRequestMethod("GET")
        val responseCode: Int = con.getResponseCode()
        val br: BufferedReader
        br = if (responseCode == 200) { // 정상 호출
            BufferedReader(InputStreamReader(con.getInputStream()))
        } else {  // 에러 발생
            BufferedReader(InputStreamReader(con.getErrorStream()))
        }
        var inputLine: String?
        val response = StringBuffer()
        while (br.readLine().also { inputLine = it } != null) {
            response.append(inputLine)
        }
        br.close()
        println(response.toString())
    } catch (e: Exception) {
        println(e)
    }
}

/**
 * CoroutineScope 설정되어 있는 API
 */
suspend fun getApi2()
{
    try {
        val apiURL = "http://localhost:8080//coroutine"
        val url = URL(apiURL)
        val con: HttpURLConnection = url.openConnection() as HttpURLConnection
        con.setRequestMethod("GET")
        val responseCode: Int = con.getResponseCode()
        val br: BufferedReader
        br = if (responseCode == 200) { // 정상 호출
            BufferedReader(InputStreamReader(con.getInputStream()))
        } else {  // 에러 발생
            BufferedReader(InputStreamReader(con.getErrorStream()))
        }
        var inputLine: String?
        val response = StringBuffer()
        while (br.readLine().also { inputLine = it } != null) {
            response.append(inputLine)
        }
        br.close()
        println(response.toString())
    } catch (e: Exception) {
        println(e)
    }
}