

object EjercicioPromedio {
  def main(args: Array[String]): Unit = {
    val califParcial1 = new Array[Int](6)
    val califParcial2 = new Array[Int](6)
    val califParcial3 = new Array[Int](6)
    val califParcial4 = new Array[Int](6)
    
    leerCalificaciones(califParcial1, califParcial2, califParcial3, califParcial4)
    
    mostrarVector(califParcial1);
    mostrarVector(califParcial2);
    mostrarVector(califParcial3);
    mostrarVector(califParcial4);
    
    obtenerPromedioParciales(califParcial1, califParcial2, califParcial3, califParcial4)
  }
  
  def mostrarVector(vector: Array[Int]): Unit = {
    println()
    for(e <- vector) 
      print(e + ", ")
  }
  
  def leerCalificaciones(califParcial1: Array[Int], califParcial2: Array[Int], 
      califParcial3: Array[Int], califParcial4: Array[Int]): Unit = {
    for(i <- 0 until 4) {
      println("------------ Parcial " + (i+1) + " ------------")
      for(j <- 0 until 6) {
        println("Materia " + (j+1))
        if (i==0) {
          califParcial1(j) = readInt()
        }
        else if (i==1) {
          califParcial2(j) = readInt()
        }
        else if (i==2) {
          califParcial3(j) = readInt()
        }
        else if (i==3) {
          califParcial4(j) = readInt()
        }
      }
    }
  }
  
  def obtenerPromedioParciales(califParcial1: Array[Int], califParcial2: Array[Int], 
      califParcial3: Array[Int], califParcial4: Array[Int]): Unit = {
    var sumatoria = 0
    for(i <- 1 to 4) {
      sumatoria = 0
      if (i==1)
        for(e <- 0 until califParcial1.length) {
          sumatoria += califParcial1(e)
          println("Promedio Parcial " + i + "=" + (sumatoria/6))
        }
      if (i==2)
        for(e <-  0 until califParcial2.length) {
          sumatoria += califParcial2(e)
          println("Promedio Parcial " + i + "=" + (sumatoria/6))
        }
      if (i==3)
        for(e <-  0 until califParcial3.length) {
          sumatoria += califParcial3(e)
          println("Promedio Parcial " + i + "=" + (sumatoria/6))
        }
      if (i==4)
        for(e <-  0 until califParcial4.length) {
          sumatoria += califParcial4(e)
          println("Promedio Parcial " + i + "=" + (sumatoria/6))
        }
    }
  }
  
  def obtenerPromedioMaterias(califParcial1: Array[Int], califParcial2: Array[Int], 
      califParcial3: Array[Int], califParcial4: Array[Int]): Unit = {
    for(i <- 0 until 6) {
      
    }
  }
  
  def obtenerPromedioGeneral(): Unit = {
    
  }
}