import scala.collection.mutable.ListBuffer


object EmpaquetarLista {
  def main(args: Array[String]): Unit = {
    println("Lista de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista = new ListBuffer[String]
    
    var palabra = ""
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista += palabra
    }
    
    for(e <- empaquetarLista(lista))
      print(e + ", ")
    println()
  }
  
  def empaquetarLista(lista: ListBuffer[String]): ListBuffer[String] = {
    val lista2 = lista
    lista2
  }
}