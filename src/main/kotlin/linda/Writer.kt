package linda

import java.io.File

fun main() {
//    writer()
    File("output.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun writer() {
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2st line\n")
        it.write("3st line\n")
    }
}