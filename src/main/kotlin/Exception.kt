import java.io.FileInputStream
import java.lang.Exception

fun main() {
    try {
        val input = FileInputStream("").read()
    } catch (e: Exception) {

    } finally {
        println("Inside finally")
    }

}