//Funcion if
/*fun main() {
   val num = 5
   //verificamos si se cumple la condicion
   if (num > 4) {
       println("La variable es mayor que 4")
   }
}*/

//Funcion if-else
/*fun main() {
    val num = 3
    //si la condicion se cumple mostrara un mensaje, caso contrario mostrara otro
    if (num > 4) {
        println("La variable es mayor que 4")
    } else {
        println("La variable es menor que 4")
    }
}*/

//funcion else-if
fun main() {
    val num = 4
    //se crea un tercera opcion que puede ser cumplida
    if (num > 4) {
        println("The variable is greater than 4")
    /*extiende una sentencia if para ejecutar una sentencia diferente 
     * en caso que la expresión if original se evalúe como false*/
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }
}
