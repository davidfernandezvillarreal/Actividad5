import scala.collection.mutable.ListBuffer


object Palindromas {
  def main(args: Array[String]): Unit = {
    println("Lista de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista = new ListBuffer[String]
    
    var palabra = ""
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista += palabra
    }
    
    for(e <- lista)
      print(e + ", ")
    println()
    
    for(e <- obtenerPalindromas(lista))
      print(e + ", ")
    println()
  }
  
  def obtenerPalindromas(lista: ListBuffer[String]): ListBuffer[String] = {
    val lista2 = new ListBuffer[String]
    var palabra = ""
    
    for (e <- lista) {
      palabra = ""
      for (i <- 0 until e.length()) 
        palabra = e.charAt(i) + palabra
      if (e.equals(palabra))
        lista2 += e
    }
    
    lista2
  }
}