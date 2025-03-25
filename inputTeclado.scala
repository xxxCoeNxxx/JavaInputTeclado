import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object imputTeclado {
  def main(args: Array[String]): Unit = {
    val datos = ArrayBuffer[String]()
    println("Introduce tus datos: ")
    
    println("\nNombre: ")
    val nombre = StdIn.readLine()
    datos += nombre

    println("\nApellidos: ")
    val apellidos = StdIn.readLine()
    datos += apellidos

    println("\nDirección: ")
    val direccion = StdIn.readLine()
    datos += direccion

    println("\nEmail: ")
    val email = StdIn.readLine()
    datos += email

    println("\nDatos introducidos: ")
    println(datos.mkString("\n") + "\n")
  }
}
    /*
    Otra manera de hacerlo si no se quiere guardar cada elemento 
    en una variable distinta, sería utilizando la misma variable 
    para todos los datos y que vaya reescribiendo el valor para 
    cada elemento.
    nuevoDato = StdIn.readLine()
    datos += nuevoDato
    */