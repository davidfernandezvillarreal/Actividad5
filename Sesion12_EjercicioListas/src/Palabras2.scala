import scala.collection.mutable.ListBuffer


object Palabras2 {
  def main(args: Array[String]): Unit = {
    println("Lista de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista = new ListBuffer[String]
    
    var palabra = ""
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista += palabra
    }
    
    println("Ingrese la palabra 1")
    palabra = readLine()
    println("Ingrese la palabra 2")
    var palabra2 = readLine()
    
    for (i <- 0 until lista.length) {
      if (lista(i).startsWith(palabra2))
        lista.update(i, palabra)
    }
    
    for(e <- lista)
      print(e + ", ")
    println()  
  }
}