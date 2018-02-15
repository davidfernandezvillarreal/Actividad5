

object FuncionesRecursivas {
  def main(args: Array[String]): Unit = {
    //cuentaRegresivaIterativa(10)
    //println()
    //cuentaRegresivaRecursiva(10)
    println(sumatoriaEnteros(6))
    println(sumatoriaEnterosIterativos(7))
    println(sumatoriaEnterosConLimitesIterativos(1, 8))
    println(sumatoriaEnterosConLimitesRecursiva(1, 9))
  }
  
  //Sumatoria de enteros desde un limite inferior hasta un limite superior 
  def sumatoriaEnterosConLimitesIterativos(li: Int, ls: Int): Int = {
    var sumatoria = 0
    var inferior = li
    while(inferior<=ls) {
      sumatoria = sumatoria + inferior
      inferior += 1
    }
    sumatoria
  }
  
  def sumatoriaEnterosConLimitesRecursiva(li: Int, ls: Int): Int = {
    var sumatoria = 0
    if (li<=ls) {
      sumatoria = li + sumatoriaEnterosConLimitesRecursiva(li+1, ls)  
    }
    sumatoria
  }
  
  def sumatoriaEnterosIterativos(numero: Int): Int = {
    var sumatoria = 0
    var num = numero
    while(num>0) {
      sumatoria = sumatoria + num
      num = num - 1
    }
    sumatoria
  }
  
  def sumatoriaEnteros(numero: Int): Int = {
    if (numero==0)
      0
    else
      return numero + sumatoriaEnteros(numero-1)
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