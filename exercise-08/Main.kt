
fun saludar(nombre: String?): String {
    if (nombre.isNullOrEmpty()) {
        return "Hola, amigo"
    } else {
        return "Hola, $nombre"
    }
}

fun main() {
    println(saludar("GIan"))
    println(saludar(""))
    println(saludar(null))
    println(saludar("vanesa"))
}
