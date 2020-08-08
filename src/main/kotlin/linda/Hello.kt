package linda

fun main(args: Array<String>) {
//    println("Hello kotlin")
    val h = Human()
    h.hello()
//    變數
    val age = 15
    var weight = 66.5f
    var name: String
    name = "linda"
    print(age)
    println(" ")
    print(weight)
    println(" ")
    print(name)
    println(" ")
//    BMI
    val b=BMI(66.5f,1.7f)
    println(b.bmi())
}

class Human {
    fun hello() {
        println("hello kotlin")
    }
}

class BMI(var weight: Float, var height: Float) {
    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
}