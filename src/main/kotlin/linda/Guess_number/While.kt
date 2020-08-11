package linda.Guess_number

import java.util.*

fun main() {
    val secret=Random().nextInt(10)+1
//    var scanner=Scanner(System.`in`)
    var number=0
    while (number!=secret){
        print("please enter a numbeer:")
        number= readLine()!!.toInt()
        if (number>secret){
            println("lower")
        }else if (number<secret){
            println("higher")
        }else{
            println("Great, the number is $number")
        }
    }
}