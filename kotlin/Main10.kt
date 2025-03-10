
fun repetirMensagem(mensagem: String, vezes: Int) {
    for (i in 1..vezes) {
        println("$i - $mensagem")
    }
}

fun main() {
    repetirMensagem("hello world", 5)
}
