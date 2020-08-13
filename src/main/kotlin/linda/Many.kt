package linda

import java.time.LocalDateTime


fun main() {
//    多筆停車費
    val parkingLot=HashMap<String,Car?>()
    var enter=LocalDateTime.of(2020,8,13,
        6,58,0)
    var car:Car?=Car("AAA-0001",enter)
    parkingLot.put(car!!.id,car)
    car=Car("BBB-0002",enter.plusMinutes(9))
    parkingLot.put(car.id,car)
    var leave=LocalDateTime.of(2020,8,14,
        7,50,9)
    car =parkingLot.get("AAA-0001")
    car?.leave=leave
    println("${car?.id} duration:${car?.duration()}")
    car=parkingLot.get("BBB-0002")
    car?.leave=leave.plusHours(2)
    println("${car?.id} duration:${car?.duration()}")
//    陣列
    val list = listOf(5, 1, 7, 2)
    println(list)
    val scores = listOf(66, 59, 89, 78, 87)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5, 1, 6, 7)
    mutableList.add(4)
    println(mutableList)
}
