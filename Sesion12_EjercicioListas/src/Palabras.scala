import scala.collection.mutable.ListBuffer


object Palabras {
  def main(args: Array[String]): Unit = {
    println("Lista de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista = new ListBuffer[String]
    
    var palabra = ""
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista += palabra
    }
    
    println("Ingrese la palabra")
    palabra = readLine()
    var contador = 0
    for(e <- lista if e.startsWith(palabra))
      contador += 1
    
    println("Numero de veces que aparece la palabra: " + contador)
  }
}