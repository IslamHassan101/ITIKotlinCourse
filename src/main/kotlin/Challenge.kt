import kotlin.random.Random
import kotlin.random.Random as Random1

fun main() {
    val guest = "GUEST"
    val input = readln()

    val name = if (input.isEmpty()) guest else input

    val message = if (name == guest) "You are a guest" else "Welcome $name"
    println(message)

    val number = Random(100)
    val list = arrayOf(number)
    for (i in list) {
        println(i)
    }
}