package linda

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.xml.bind.JAXBElement
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    var counter=1
    var ms= measureTimeMillis {
        for (n in 1..100_000){
            thread {
                counter++
            }
            println(n)
        }
    }
//    var ms= measureTimeMillis {
//        for (n in 1..100_000){
//            GlobalScope.launch {
//                counter++
//            }
//        }
//    }
    println(ms)
}