import scala.collection.mutable.ListBuffer


object SumaAcumulada {
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
    
    for(e <- obtenerSumaAcumulada(lista))
      print(e + ", ")
    println()
  }
  
  def obtenerSumaAcumulada(lista: ListBuffer[Int]): ListBuffer[Int] = {
    val lista2 = new ListBuffer[Int]
    for (i <- 0 until lista.length) {
      if (i==0)
        lista2 += lista(i)
      else
        lista2 += (lista(i) + lista2(i-1))
    }
    lista2
  }
}