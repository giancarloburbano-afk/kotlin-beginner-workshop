
fun main() {

    val lista = listOf(2, 4, 1, 1, 1, 5, 10, 3, 5, 5)

    var suma: Int = 0
    var mayor = lista[0]
    var menor = lista[0]
    var pares = 0
    var impares = 0

    println("Elementos de la lista:")

    for (i in lista) {
        println(i)

        suma += i

        if (i > mayor) {
            mayor = i
        }

        if (i < menor) {
            menor = i
        }

        if (i % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }

    val promedio = suma.toDouble() / lista.size

    println()
    println("Suma: $suma")
    println("Promedio: $promedio")
    println("Número mayor: $mayor")
    println("Número menor: $menor")
    println("Cantidad de pares: $pares")
    println("Cantidad de impares: $impares")
}
