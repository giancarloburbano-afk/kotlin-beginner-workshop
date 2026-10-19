
class Product{
    
    var nombre:String =""
    var precio:Int = 0
    var cantidad:Int = 0
    
    fun valor_inventario(){
        
        var multiplicacion:Int=0
        multiplicacion=precio*cantidad
        println("Valor total: $nombre es de $multiplicacion\n ")
    
    }

    fun mostrar_informacion(){
        println("Nombre: $nombre \n Precio: $precio \n Cantidad: $cantidad\n ")
    }
}    

fun main() {
   
    val producto1 = Product()
    producto1.nombre = "Arroz"
    producto1.precio = 3000
    producto1.cantidad = 5

    val producto2 = Product()
    producto2.nombre = "Leche"
    producto2.precio = 4500
    producto2.cantidad = 3

    val producto3 = Product()
    producto3.nombre = "Pan"
    producto3.precio = 2000
    producto3.cantidad = 10

    println("PRODUCTO 1\n ")
    producto1.mostrar_informacion()
    producto1.valor_inventario()

    println("\nPRODUCTO 2")
    producto2.mostrar_informacion()
    producto2.valor_inventario()

    println("\nPRODUCTO 3")
    producto3.mostrar_informacion()
    producto3.valor_inventario()
}
