
class Contact {

    var nombre: String = ""
    var telefono: String = ""
    var correo: String = ""

}

val contactos = mutableListOf<Contact>()

fun agregar(contacto: Contact) {
    contactos.add(contacto)
}

fun listar() {
    for (contacto in contactos) {
        println("Nombre: ${contacto.nombre}, Telefono: ${contacto.telefono}, Correo: ${contacto.correo}")
    }
}

fun buscar(nombre: String) {
    var encontrado = false

    for (contacto in contactos) {
        if (contacto.nombre == nombre) {
            println("Nombre: ${contacto.nombre}, Telefono: ${contacto.telefono}, Correo: ${contacto.correo}")
            encontrado = true
        }
    }

    if (!encontrado) {
        println("El contacto no existe")
    }
}

fun eliminar(nombre: String) {
    var encontrado = false

    for (contacto in contactos) {
        if (contacto.nombre == nombre) {
            contactos.remove(contacto)
            encontrado = true
            break
        }
    }

    if (!encontrado) {
        println("El contacto no existe")
    }
}

fun main() {

    val c1 = Contact()
    c1.nombre = "Juan"
    c1.telefono = "3001234567"
    c1.correo = "juan@gmail.com"
    agregar(c1)

    val c2 = Contact()
    c2.nombre = "Maria"
    c2.telefono = "3011234567"
    c2.correo = "maria@gmail.com"
    agregar(c2)

    val c3 = Contact()
    c3.nombre = "Pedro"
    c3.telefono = "3021234567"
    c3.correo = "pedro@gmail.com"
    agregar(c3)

    val c4 = Contact()
    c4.nombre = "Ana"
    c4.telefono = "3031234567"
    c4.correo = "ana@gmail.com"
    agregar(c4)

    val c5 = Contact()
    c5.nombre = "Luis"
    c5.telefono = "3041234567"
    c5.correo = "luis@gmail.com"
    agregar(c5)

    println("Lista de contactos:")
    listar()

    println("\nBuscar contacto:")
    buscar("Maria")

    println("\nEliminar contacto:")
    eliminar("Pedro")

    println("\nLista actualizada:")
    listar()

    println("\nBuscar contacto que no existe:")
    buscar("Carlos")
}
