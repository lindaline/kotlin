package linda.student

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    var name = scanner.next()
    print("please enter student's english:")
    var english = scanner.nextInt()
    print("please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    val test = 123
    println("text is:$test")
    println("High score:${stu.highest()}")
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${PassOrFailed()}\t${grading()}")
    }

    fun highest(): Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max
    }

    fun getAverage(): Int {
        return (english + math) / 2
    }

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun PassOrFailed() = if (getAverage() >= 60) "Pass" else "Failed"
}