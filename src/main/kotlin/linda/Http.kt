package linda

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url=URL("http://zh.wikipedia.org/wiki/以家人之名")
    with(url.openConnection()as HttpURLConnection){
        var br=BufferedReader(InputStreamReader(inputStream))
        var line=br.readLine()
        var json=StringBuffer()
        while(line != null){
            json.append(line)
            line=br.readLine()
        }
        println(json.toString())
    }
}