import scala.collection.mutable.ListBuffer


object Capicua {
  def main(args: Array[String]): Unit = {
    println("Lista de numeros. Ingrese el numero y presione 'ENTER': \nIngrese 'x' para detener")
    
    val lista = new ListBuffer[Int]
    
    var numero = ""
    while (!numero.equals("x")) {
      numero = readLine()
      if (!numero.equals("x")) {
        try {
          lista += numero.toInt
        } catch {
          case nfe: NumberFormatException => println("INGRESE SOLO NUMEROS")
        }
      }
    }
    
    for(e <- lista)
      print(e + ", ")
    println()
    
    for(e <- obtenerCapicua(lista))
      print(e + ", ")
    println()
  }
  
  def obtenerCapicua(lista: ListBuffer[Int]): ListBuffer[Int] = {
    var lista2 = new ListBuffer[Int]
    var numero = ""
    
    for (e <- lista) {
      numero = ""
      for (i <- 0 until e.toString().length()) 
        numero = e.toString().charAt(i) + numero
      if (e.toString().equals(numero)) 
        lista2 += e
    }
    lista2
  }
}