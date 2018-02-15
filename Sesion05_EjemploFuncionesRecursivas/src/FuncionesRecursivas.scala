

object FuncionesRecursivas {
  def main(args: Array[String]): Unit = {
    cuentaRegresivaIterativa(10)
    println()
    cuentaRegresivaRecursiva(10)
  }
  
  /*3 puntos importante a si misma
   * Llamarse a si mismo
   * Debe terminar - CASO BASE
   * Parámetro - Problema de menor tamaño
   */
  
  //
  def funcionRecursiva(x: Int): Unit = {
    
  }
  
  def cuentaRegresivaIterativa(inicio: Int): Unit = {
    var i = inicio
    println("Cuenta Regresiva Iterativa")
    while(i>0) {
      print(i + " ")
      i -= 1
    }
  }
  
  def cuentaRegresivaRecursiva(inicio: Int): Unit = {
    /*Funcion que imprime una cuenta regresiva comenzando en el limite recibido 
     * como parametro (comentario similar a PYTHON)*/
    if (inicio>0) {
      println(inicio + " ")
      cuentaRegresivaRecursiva(inicio-1)
    }
  }
}