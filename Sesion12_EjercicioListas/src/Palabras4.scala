import scala.collection.mutable.ListBuffer


object Palabras4 {
  def main(args: Array[String]): Unit = {
    println("Lista 1 de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista1 = new ListBuffer[String]
    var palabra = ""
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista1 += palabra
    }
    
    println("Lista 2 de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista2 = new ListBuffer[String]
    
    palabra = ""
    
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista2 += palabra
    }
    
    var contador = 0
    
    for (e1 <- lista1) {
      for (e2 <- lista2) {
        if (e2.equals(e1)) {
          lista1.remove(contador)
          contador -= 1
        }   
      }
      contador += 1
    }
    
    for(e <- lista1)
      print(e + ", ")
    println()
  }
}