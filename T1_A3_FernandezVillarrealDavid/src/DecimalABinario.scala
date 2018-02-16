

object DecimalABinario {
  def main(args: Array[String]): Unit = {
    println(convertirDecABin(10))
  }
  
  def convertirDecABin(decimal: Int): String = {
    if (decimal!=0) 
      return  convertirDecABin(decimal/2) + decimal%2
    else return ""
  }
}