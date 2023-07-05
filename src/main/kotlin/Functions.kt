fun main() {
    println(permitAccess(17, 18, 161, 30))



    println(5 addAndCheckEven 1)
    println(concatList(separator = ",", list = listOf("Android", "Kotlin", "Java")))
    println(concatList(listOf("Android", "Kotlin", "Java")))
}

fun permitAccess(vararg ages: Int): Boolean {
    for (age in ages) {
        if (age > 18) return false
    }
    return true
}

fun concatList(list: List<String>, separator: String = ":") = list.joinToString(separator)

//extension fun
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

//infex fun
infix fun Int.addAndCheckEven(number: Int) = (this + number).isEven()


