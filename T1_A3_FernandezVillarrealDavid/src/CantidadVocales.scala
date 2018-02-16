

object CantidadVocales {
  def main(args: Array[String]): Unit = {
    println("Ingrese la cadena")
    val cadena = readLine()
    println(contarVocalesCadena(cadena, cadena.length()-1))
  }
  
  def contarVocalesCadena(cadena: String, l: Int): Int = {
    if (l>=0) 
      if (cadena(l).equals('a') || cadena(l).equals('e') ||
          cadena(l).equals('i') || cadena(l).equals('o') ||
          cadena(l).equals('u')) 
       return contarVocalesCadena(cadena, l-1) + 1 
      else 
        return contarVocalesCadena(cadena, l-1)
    else return 0
  }
}