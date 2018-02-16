

object SumatoriaConLimite {
  def main(args: Array[String]): Unit = {
    println(sumatoriaEnterosConLimites(1, 10))
  }
  
  def sumatoriaEnterosConLimites(li: Int, ls: Int): Int = {
    if (li<=ls) {
      return li + sumatoriaEnterosConLimites(li+1, ls)  
    } else return 0
  }
}