

fun main() {
    val num1: Int= 4
    val num2: Int= 0
    val operacion:String = "Divi"
    when (operacion){
        "Suma"-> println(num1 + num2)
        "Resta"-> println(num1 - num2)
        "Multi"-> println(num1 * num2)
        "Divi"-> if(num2==0){
        			println("No se puede")
                    }
        
        		else{
        		println(num1/num2)
                }
    }
    
}
