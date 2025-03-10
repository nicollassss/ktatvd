fun verificarSenha(senhaCorreta: String, tentativa: String) {
    if (tentativa == senhaCorreta) {
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
}

fun main() {

    val senhaCorreta = "1235"


    verificarSenha(senhaCorreta, "1234")  // Acesso permitido
    verificarSenha(senhaCorreta, "abcd")  // Acesso negado
}