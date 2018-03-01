import scala.collection.mutable.ArrayBuffer
import scala.util.Random


object EjercicioVectores2 {
  def main(args: Array[String]): Unit = {
    llenarVector()
    println("Promedio de horas a 25 grados: " + obtenerPromedioHoras())
  }
  
  def llenarVector(): ArrayBuffer[Int] = {
    val vector = new Array[Int](48)
    val vectorTemp25 = ArrayBuffer[Int]()
    
    for(i <- 0 until (vector.length/2)) {
      vector(i) = i
      vector(i+1) = Random.nextInt(51)
      //println()
      //print(vector(i) + " v " + vector(i+1))
      
      if (vector(i+1)==25) {
        println("Hora: " + vector(i) + ", Temp: " + vector(i+1))
        vectorTemp25 += (i)
      }
    }
    
    vectorTemp25
  }
  
  def obtenerPromedioHoras(): Double = {
    val vectorTemp25 = llenarVector()
    if (vectorTemp25.length!=0) {
      var sumatoria = 0
      for(i <- 0 until vectorTemp25.length) {
        sumatoria += vectorTemp25(i)
      }
      
      var promedio = sumatoria / vectorTemp25.length
      return promedio
    } else return 0.0
  }
  
  def mostrarVectorNumeros(vector: ArrayBuffer[Int]): Unit = {
    println()
    for(e <- vector) 
      print(e + ", ")
  }
}