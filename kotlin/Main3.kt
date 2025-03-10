fun soma(a: Int, b: Int) = a + b
fun subtracao(a: Int, b: Int) = a - b
fun multiplicacao(a: Int, b: Int) = a * b
fun divisao(a: Int, b: Int): Double {
    return if (b != 0) a.toDouble() / b else Double.NaN
}

fun main() {
    val a = 10
    val b = 5

    println("Soma: ${soma(a, b)}")
    println("Subtração: ${subtracao(a, b)}")
    println("Multiplicação: ${multiplicacao(a, b)}")
    println("Divisão: ${divisao(a, b)}")
}