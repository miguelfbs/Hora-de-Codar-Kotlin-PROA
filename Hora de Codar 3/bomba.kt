package HoraDeCodar3

fun main() {
    for (i in 30 downTo 0) {
        print("\r$i ")
        Thread.sleep(500)
    }
    print("\rBOOOOOM!")
}