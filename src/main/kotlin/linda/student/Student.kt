package linda.student

import java.util.*

fun main() {
    Student.pass=70
    val stu=Student("linda",60,89)
    val stu2=Student("Danny",50,80)
    val stu3=Student("Hank",70,69)
    val gut=GraduateStudent("Eric",78,89,87)
    gut.print()
    println("GraduateStudent High score: ${gut.highest()}")
    stu.print()
    stu2.print()
    stu3.print()
    val test = 123
    println("text is:$test")
    println("High score:${stu.highest()}")
}

class GraduateStudent(name:String?,english:Int,math:Int,var thesis:Int):Student(name,english,math){
    companion object{
        var pass=50
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${PassOrFailed()}\t${grading()}")
    }

    override fun getAverage(): Int {
        return (english+math+thesis)/3
    }

    override fun PassOrFailed()= if (getAverage() >= pass) "Pass" else "Failed"
    override fun highest(): Int {
        var max = if (english > math) {
            if (english>thesis){
                println("english")
                english
            }else if (thesis>math){
                println("thesis")
                thesis
            }else{
                println("math")
                math
            }
        } else if (math>thesis){
            println("math")
            math
        }else{
            println("thesis")
            thesis
        }
        return max
    }
}

open class Student(var name: String?, var english: Int, var math: Int) {
    companion object{
        @JvmStatic
        var pass=60
        fun test(){
            kotlin.io.println("testing")
        }
    }
    open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${PassOrFailed()}\t${grading()}")
    }

    open  fun highest(): Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max
    }

    open fun getAverage(): Int {
        return (english + math) / 2
    }

    open fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun PassOrFailed() = if (getAverage() >= pass) "Pass" else "Failed"

    fun more() {
        val scanner = Scanner(System.`in`)
        print("Please enter student's name:")
        var name = scanner.next()
        print("please enter student's english:")
        var english = scanner.nextInt()
        print("please enter student's math:")
        var math = scanner.nextInt()
    }
}