

fun main() {
    
    val nombre:String = "Gian"
    val nota1= 3.5
    val nota2= 4.5
    val nota3= 1.0
    val promedio = (nota1 +nota2+nota3)/3
    
    if (promedio >= 4.5){
       
        println("$nombre $promedio Excelente")
        
        
    }
    
    if (promedio>= 3.0){
       
        println("$nombre $promedio Aprovado")
        
        
    }
    else{
       println("$nombre $promedio Reprobao")
    }
    
    
    
    
}
