
fun exibirArray(array: Array<String>) {
    for (item in array) {
        println(item)
    }
}

fun main() {
    val meuArray = arrayOf("Civic", "Veloster", "Sandero", "AS Vintage")


    exibirArray(meuArray)
}