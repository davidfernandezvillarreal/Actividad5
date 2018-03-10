import scala.collection.mutable.ListBuffer


object NumeroEnteros {
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
    lista += (1, 4, 8, 3, 5)
    for(e <- lista)
      print(e + ", ")
    println()
    
    for(e <- obtenerNumerosPrimos(lista))
      print(e + ", ")
    println()
    
    obtenerSumatoriaYPromedio(lista)
    
    for(e <- obtenerFactorial(lista))
      print(e + ", ")
    println()
  }
  
  def obtenerNumerosPrimos(lista: ListBuffer[Int]): ListBuffer[Int] = {
    val lista2 = new ListBuffer[Int]
    var a = 0
    for(e <- lista) {
      a = 0
      for(i <- 1 to e) 
        if (e%i == 0)
          a += 1
      if (a<=2)
        lista2 += e
    }
    lista2
  }
  
  def obtenerSumatoriaYPromedio(lista: ListBuffer[Int]): Unit = {
    var sumatoria = 0
    for (e <- lista) 
      sumatoria += e
    
    println("Sumatoria: " + sumatoria)
    println("Promedio: " + sumatoria.toDouble/lista.length)
  }
  
  def obtenerFactorial(lista: ListBuffer[Int]): ListBuffer[Long] = {
    var lista2 = new ListBuffer[Long]
    var factorial = 1
    for (e <- lista) {
      for (i <- 1 to e) {
        factorial = factorial * i
      }
      lista2 += factorial
      factorial = 1
    }
    lista2
  }
}