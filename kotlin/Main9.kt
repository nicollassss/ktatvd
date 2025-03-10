fun compararValores(a: Int, b: Int) {
    if (a > b) {
        println("Maior: $a, Menor: $b")
    } else if (a < b) {
        println("Maior: $b, Menor: $a")
    } else {
        println("Os valores são iguais: $a e $b")
    }
}

fun main() {
    compararValores(10, 5)
    compararValores(3, 8)
    compararValores(7, 7)
}