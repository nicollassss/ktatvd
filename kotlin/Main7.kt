fun adicionarItemArray(array: MutableList<String>, item: String) {
    array.add(item)
    println("Item adicionado: $item")
}

fun main() {

    val listaDeCompras = mutableListOf("Maçã", "Banana", "Laranja")


    adicionarItemArray(listaDeCompras, "Morango")
    adicionarItemArray(listaDeCompras, "Pessego")


    println("Lista final: $listaDeCompras")
}