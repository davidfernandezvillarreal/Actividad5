

object CantidadCocientesEntreDosNumero {
  def main(args: Array[String]): Unit = {
    println("Ingrese cualquier número")
    val entrada = readInt
    println("Ingrese el número limite")
    val limite = readInt
    println("Número de divisores: ")
    println(obtenerDivisores(entrada, entrada, limite))
  }
  
  def obtenerDivisores(numero: Int, divisor: Int, limite: Int): Int = {
    if(divisor>=limite) {
      if ((numero%divisor)==0) {
        return obtenerDivisores(numero, divisor-1, limite) + 1
      } else return obtenerDivisores(numero, divisor-1, limite)
    } else return 0
  }
}