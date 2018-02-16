

object Divisores {
  def main(args: Array[String]): Unit = {
    println("Ingrese cualquier número")
    val entrada = readInt
    println("Divisores: ")
    obtenerDivisores(entrada, entrada)
  }
  
  def obtenerDivisores(numero: Int, divisor: Int): Unit = {
    if(divisor!=0) {
      if ((numero%divisor)==0) {
        print(divisor + ", ")
      }
      obtenerDivisores(numero, divisor-1)
    }
  }
}