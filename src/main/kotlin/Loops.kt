fun main() {
    for (i in 1..10) {
        println("$i")
    }

    val string = "KOTLIN"

    for (i in string) {
        print("$i ")
    }

    for (i in 1 downTo -10) {
        print("$i ")
    }

    println()
    val list = listOf("Android", "Kotlin", "Spring")
    for (i in list) {
        println(i)
    }

    println()

    var index = 0
    while (index <= 10) {
        println(index)
        index++
    }

    var index2 = 0
    do {
        println(index2)
        index2++
    } while (index2 <= 11)
}