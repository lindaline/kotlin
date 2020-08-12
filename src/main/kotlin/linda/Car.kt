package linda

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter=LocalDateTime.of(2020,8,12,8,0,0)
    val leave=LocalDateTime.of(2020,8,12,13,50,0)
    var car=Car("AAA-ooo1",enter)
    car.leave=leave
    println(car.duration())
    val hours=Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime?=null
    set(value) {
        if (enter.isBefore(value))
            field=value
    }
    fun duration()=Duration.between(enter,leave).toMinutes()
}