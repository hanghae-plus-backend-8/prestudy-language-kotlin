package study.week1.discphy

fun main() {
    for (i in 1..10) {
        println("$i 번째 for1")
    }

    println()

    for (i in 1 until 10) {
        println("$i 번째 for2")
    }

    val infos = arrayOf("참새", "갈매기", "꿩", "공작새")

    println()

    for (info in infos) {
        println("$info 새 종류")
    }
}