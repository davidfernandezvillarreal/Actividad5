import scala.collection.mutable.ListBuffer


object Palabras3 {
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
    
    for(i <- 0 until lista.length)
      if (lista(i).startsWith(palabra))
        lista.remove(i)
    
    for(e <- lista)
      print(e + ", ")
    println()
  }
}