import scala.collection.mutable.ListBuffer


object Palabras5 {
  def main(args: Array[String]): Unit = {
    println("Lista 1 de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista1 = new ListBuffer[String]
    
    var palabra = ""
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista1 += palabra
    }
    
    println("Lista 2 de palabras. Ingrese la palabra y presione 'ENTER': \nIngrese '0' para detener")
    
    val lista2 = new ListBuffer[String]
    palabra = ""
    
    while (!palabra.equalsIgnoreCase("0")) {
      palabra = readLine()
      if (!palabra.equals("0"))
        lista2 += palabra
    }
    
    val lista3 = new ListBuffer[String]
    for (e <- lista1)
      lista3 += e 
      
    var c = 0
    
    for(e2 <- lista2) {
      c = 0
      for (e1 <- lista1)
        if (!e2.equals(e1))
          c += 1
      if (c==lista1.length)
        lista3 += e2
    }
      
    println("\n=============================================")
    for(e <- lista3)
      print(e + ", ")
    
    val lista4 = new ListBuffer[String]
    for(e1 <- lista1) {
      c = 0
      for (e2 <- lista2)
        if (!e1.equals(e2)) 
          c += 1
      if (c==lista1.length) 
        lista4 += e1
    }
    
    println("\n=============================================")
    for(e <- lista4)
      print(e + ", ")
       
    val lista5 = new ListBuffer[String]
    for(e2 <- lista2) {
      c = 0
      for (e1 <- lista1)
        if (!e2.equals(e1)) 
          c += 1
      if (c==lista2.length) 
        lista5 += e2
    }
    
    println("\n=============================================")
    for(e <- lista5)
      print(e + ", ")
  }
}