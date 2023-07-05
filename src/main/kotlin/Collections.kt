
fun main() {
    
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(array.joinToString())

    val list: MutableList<Int> = mutableListOf(1, 2, 3)
    println(list.joinToString())

    val set = setOf(1, 2, 3, 1)
    println(set.joinToString())

    val map: MutableMap<Int, String> = mutableMapOf(Pair(1, "kotlin"), Pair(2, "Java"), Pair(3, "Android"))
    println(map)
}