

object Factorial {
  def main(args: Array[String]): Unit = {
    println(obtenerFactorial(5))
  }
  
  def obtenerFactorial(numero: Int): Int = {
    if (numero!=0) {
      return numero * obtenerFactorial(numero-1)
    } else return 1
  }
}