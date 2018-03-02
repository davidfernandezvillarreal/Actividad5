

object ExParcial1 {
  def main(args: Array[String]): Unit = {
    println("Ingrese un numero para obtener su raiz cuadrada:")
    val numero = readInt()
    println("Ingrese cuantos decimales quiere:")
    val decimales = readLine()
    println("estimacion inicial:\n" + obtenerEstimacion(numero))
    println("promedio:\n" + ("%." + decimales + "f").format(obtenerPromedio(numero, decimales)))
  }
  
  def obtenerEstimacion(numero: Int): Double = {
    var n = numero + 0.0
    
    while((n*n)>numero) 
      n = n/2 
    n
  }
  
  def obtenerCociente(numero: Int): Double = {
    var estimacion = obtenerEstimacion(numero)
    val cociente = numero/estimacion
    cociente
  }
  
  def obtenerPromedio(numero: Int, decimales: String): Double = {
    var estimacion = obtenerEstimacion(numero)
    var cociente = obtenerCociente(numero)
    var promedio = (cociente + estimacion) / 2
    
    while ((("%." + decimales + "f").format(promedio)) != (("%." + decimales + "f").format(estimacion))) {
      println("e: " + estimacion)
      estimacion = promedio
      cociente = numero/estimacion
      promedio = (cociente + estimacion) / 2
      println("p: " + promedio)
    }
    
    promedio
  }
}