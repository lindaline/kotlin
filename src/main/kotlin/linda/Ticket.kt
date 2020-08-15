package linda

import kotlin.random.Random



data class Ticket(val origin:Int,val destination:Int,val price:Int)

fun main() {
    var ticket=Ticket(45,50,450)
    println(ticket)
    val s="abcdef"
    println((1..10).random())
}

fun String.validate():Boolean{
    return this.length>=6
}

fun IntRange.random():Int{
    val r= java.util.Random().nextInt(endInclusive-start)+start
    return r
}