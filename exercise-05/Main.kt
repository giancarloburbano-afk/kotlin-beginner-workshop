
fun isPrime(number: Int): Boolean {
    if (number < 2) return false

    for (i in 2 until number) {
        if (number % i == 0) return false
    }

    return true
}

fun factorial(number: Int): Int {
    var resultado = 1

    for (i in 1..number) {
        resultado = resultado * i
    }

    return resultado
}

fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}

fun main() {
    val numero = 5

    println("Es primo: ${isPrime(numero)}\n\nFactorial: ${factorial(numero)}\n\nEs par: ${isEven(numero)}")
}
