package linda.計算機

import java.util.*

fun main() {
    println("這是一個計算機")
    val scanner = Scanner(System.`in`)
    print("請輸入第一個數字:")
    var x = scanner.nextInt()
    print("請輸入運算式(+;-;*;/):")
    var Expression = scanner.next()
    print("請輸入第二個數字:")
    var y = scanner.nextInt()
    var count = Count(x, Expression, y)
    count.print()
}

class Count(var x: Int, var Expression: String, var y: Int) {
    fun print() {
        print(x)
        print(Expression + y + "=" + answer())
    }

    fun answer()= when (Expression) {
        "+" -> x + y
        "-" -> x - y
        "*" -> x * y
        "/" -> x / y
        else -> 0
    }
}