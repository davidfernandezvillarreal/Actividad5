import scala.collection.mutable.ListBuffer


class Alumno(private var _numControl: String = "NA", private var _nombre: String = "NA", 
    private var _primerAp: String = "NA", private var _segundoAp: String = "NA", private var _edad: Byte = 0, 
    private var _semestre: Byte = 0, private var _carrera: String = "NA",  
    private var _califSemestrales: ListBuffer[ListBuffer[Byte]] = null) {
  
  def numControl = _numControl
  def nombre = _nombre
  def primerAp = _primerAp
  def segundoAp = _segundoAp
  def edad = _edad
  def semestre = _semestre
  def carrera = _carrera
  def califSemestrales = _califSemestrales
  
  def numControl_= (numControl: String): Unit = {
    _numControl = numControl
  }
  
  def nombre_= (nombre: String): Unit = {
    _nombre = nombre
  }
  def primerAp_= (primerAp: String): Unit = {
    _primerAp = primerAp
  }
  def segundoAp_= (segundoAp: String): Unit = {
    _segundoAp = segundoAp
  }
  def edad_= (edad: Byte): Unit = {
    _edad = edad
  }
  def califSemestral_= (califSemestrales: ListBuffer[ListBuffer[Byte]]): Unit = {
    _califSemestrales = califSemestrales
  }
  
  def obtenerPromedioGeneral(): Double = {
    var sumatoria = 0
    var numDeMaterias = 0
    for(e <- califSemestrales) {
      numDeMaterias += e.length
      for(d <- e) 
        sumatoria += d
    }
    val promedio = sumatoria/numDeMaterias
    promedio
  }
  
  def obtenerRFC(): String = {
    var RFC = primerAp.charAt(0).toUpper.toString()
    var vocalesPrimerAp = ""
    for (i <- 0 until primerAp.length()) {
      if (primerAp.charAt(i).toString().equalsIgnoreCase("A") ||
          primerAp.charAt(i).toString().equalsIgnoreCase("E") ||
          primerAp.charAt(i).toString().equalsIgnoreCase("I") ||
          primerAp.charAt(i).toString().equalsIgnoreCase("O") ||
          primerAp.charAt(i).toString().equalsIgnoreCase("U")) {
        vocalesPrimerAp += primerAp(i).toUpper
      }
    }
    
    RFC += vocalesPrimerAp.charAt(0)
    RFC += segundoAp.charAt(0).toUpper
    RFC += nombre.charAt(0).toUpper
    
    RFC
  }
  
  def mostarCalifAprobatoriasYSemestre(): Unit = {
    var semestre = 1
    println("Calificaciones aprobatorias por semestre")
    
    for(e <- califSemestrales) {
      println("Semestre: " + semestre)
      println("Calificaciones")
      print("(")
      for (d <- e) {
        if (d>=70 && d<=100) {
          print(d + ", ")
        }
        
      }
      print(")\n")
      semestre += 1
    }
  }
  
  def obtenerCalifSemestresReprobados(): ListBuffer[Byte] = {
    var reprobadas = 0
    var reprobadasPorSemestre = new ListBuffer[Byte]
    
    for (e <- califSemestrales) {
      for (d <- e) {
        if (d>=0 && d<70) {
          reprobadas += 1
        }
      }
      reprobadasPorSemestre += reprobadas.toByte
      reprobadas = 0
    }
    
    reprobadasPorSemestre
  }
}

class PruebaAlumnos {
  var cardex1 = ListBuffer(
      ListBuffer[Byte](100, 90, 80, 80, 90, 80), 
      ListBuffer[Byte](70, 80, 90, 100, 90, 90),
      ListBuffer[Byte](80, 100, 90, 100, 90, 100),
      ListBuffer[Byte](100, 70, 70, 100, 90, 100),
      ListBuffer[Byte](90, 80, 90, 100, 90, 80),
      ListBuffer[Byte](100, 100, 90, 100, 90, 100),
      ListBuffer[Byte](0, 0, 0, 0, 0, 0),
      ListBuffer[Byte](80, 80, 90, 100, 90, 70)
      )
  var cardex2 = ListBuffer(
      ListBuffer[Byte](70, 100, 89, 79, 93, 97), 
      ListBuffer[Byte](100, 80, 100, 80, 34, 87),
      ListBuffer[Byte](80, 71, 95, 80, 90, 70),
      ListBuffer[Byte](79, 70, 76, 100, 90, 80),
      ListBuffer[Byte](78, 80, 76, 100, 90, 100),
      ListBuffer[Byte](100, 100, 0, 80, 90, 100),
      ListBuffer[Byte](0, 100, 90, 60, 90, 0),
      ListBuffer[Byte](80, 70, 90, 80, 90, 60)
      )
  var cardex3 = ListBuffer(
      ListBuffer[Byte](100, 83, 70, 80, 74, 80), 
      ListBuffer[Byte](100, 91, 97, 80, 97, 93),
      ListBuffer[Byte](80, 100, 90, 100, 90, 100),
      ListBuffer[Byte](100, 70, 98, 100, 90, 100),
      ListBuffer[Byte](90, 96, 90, 0, 90, 80),
      ListBuffer[Byte](100, 100, 90, 100, 90, 100),
      ListBuffer[Byte](100, 100, 100, 100, 100, 100),
      ListBuffer[Byte](89, 80, 90, 96, 90, 90)
      )
  var cardex4 = ListBuffer(
      ListBuffer[Byte](100, 70, 80, 80, 90, 80), 
      ListBuffer[Byte](70, 80, 90, 100, 90, 90),
      ListBuffer[Byte](80, 100, 90, 100, 90, 100),
      ListBuffer[Byte](100, 89, 70, 100, 90, 100),
      ListBuffer[Byte](90, 80, 89, 100, 90, 80),
      ListBuffer[Byte](100, 100, 89, 98, 76, 67),
      ListBuffer[Byte](90, 0, 0, 80, 0, 100),
      ListBuffer[Byte](80, 70, 90, 100, 92, 70)
      )
  var cardex5 = ListBuffer(
      ListBuffer[Byte](100, 90, 80, 80, 90, 80), 
      ListBuffer[Byte](90, 80, 90, 100, 90, 80),
      ListBuffer[Byte](80, 100, 90, 100, 90, 100),
      ListBuffer[Byte](0, 0, 0, 0, 0, 0),
      ListBuffer[Byte](70, 80, 90, 100, 90, 90),
      ListBuffer[Byte](100, 100, 90, 100, 90, 100),
      ListBuffer[Byte](100, 70, 70, 100, 90, 100),
      ListBuffer[Byte](80, 80, 90, 100, 90, 70)
      )
      
  val a1 = new Alumno("14070010", "David", "Fernandez", "Villarreal", 21, 8, "ISC", cardex1)
  val a2 = new Alumno("14070080", "Pedro", "Hernandez", "Juarez", 21, 8, "ISC", cardex2)
  val a3 = new Alumno("14070034", "Alma", "Villa", "Martinez", 23, 8, "ISC", cardex3)
  val a4 = new Alumno("14070054", "Gerardo", "Arrellano", "Felix", 22, 8, "ISC", cardex4)
  val a5 = new Alumno("14070125", "Alexis", "Medina", "Escobedo", 22, 8, "ISC", cardex5)
  
  def obtenerPromedioGrupal(): Double = {
    var sumatoria = a1.obtenerPromedioGeneral() + a2.obtenerPromedioGeneral() + a3.obtenerPromedioGeneral() +
    a4.obtenerPromedioGeneral() + a5.obtenerPromedioGeneral()
    val promedio = sumatoria/5
    promedio
  }
  
  def obtenerSemestresMasReprobados(): ListBuffer[Byte] = {
    var semestre1 = a1.obtenerCalifSemestresReprobados()(0) + a2.obtenerCalifSemestresReprobados()(0) + 
        a3.obtenerCalifSemestresReprobados()(0) + a4.obtenerCalifSemestresReprobados()(0) + 
        a5.obtenerCalifSemestresReprobados()(0)
    var semestre2 = a1.obtenerCalifSemestresReprobados()(1) + a2.obtenerCalifSemestresReprobados()(1) + 
        a3.obtenerCalifSemestresReprobados()(1) + a4.obtenerCalifSemestresReprobados()(1) + 
        a5.obtenerCalifSemestresReprobados()(1)
    var semestre3 = a1.obtenerCalifSemestresReprobados()(2) + a2.obtenerCalifSemestresReprobados()(2) + 
        a3.obtenerCalifSemestresReprobados()(2) + a4.obtenerCalifSemestresReprobados()(2) + 
        a5.obtenerCalifSemestresReprobados()(2)
    var semestre4 = a1.obtenerCalifSemestresReprobados()(3) + a2.obtenerCalifSemestresReprobados()(3) + 
        a3.obtenerCalifSemestresReprobados()(3) + a4.obtenerCalifSemestresReprobados()(3) + 
        a5.obtenerCalifSemestresReprobados()(3)
    var semestre5 = a1.obtenerCalifSemestresReprobados()(4) + a2.obtenerCalifSemestresReprobados()(4) + 
        a3.obtenerCalifSemestresReprobados()(4) + a4.obtenerCalifSemestresReprobados()(4) + 
        a5.obtenerCalifSemestresReprobados()(4)
    var semestre6 = a1.obtenerCalifSemestresReprobados()(5) + a2.obtenerCalifSemestresReprobados()(5) + 
        a3.obtenerCalifSemestresReprobados()(5) + a4.obtenerCalifSemestresReprobados()(5) + 
        a5.obtenerCalifSemestresReprobados()(5)
    var semestre7 = a1.obtenerCalifSemestresReprobados()(6) + a2.obtenerCalifSemestresReprobados()(6) + 
        a3.obtenerCalifSemestresReprobados()(6) + a4.obtenerCalifSemestresReprobados()(6) + 
        a5.obtenerCalifSemestresReprobados()(6)
    var semestre8 = a1.obtenerCalifSemestresReprobados()(7) + a2.obtenerCalifSemestresReprobados()(7) + 
        a3.obtenerCalifSemestresReprobados()(7) + a4.obtenerCalifSemestresReprobados()(7) + 
        a5.obtenerCalifSemestresReprobados()(7)
    
    var semestresReprobadosGrupal = new ListBuffer[Int]
    semestresReprobadosGrupal += (semestre1, semestre2, semestre3, semestre4, semestre5, semestre6, semestre7, semestre8)
    
    var semestresMasReprobadosGrupal = semestresReprobadosGrupal(0)
    
    for (i <- 1 until semestresReprobadosGrupal.length) 
      if (semestresReprobadosGrupal(i)>=semestresMasReprobadosGrupal) 
        semestresMasReprobadosGrupal = semestresReprobadosGrupal(i)
    
    var listaDeSemestresMasReprobados = new ListBuffer[Byte]
    for (i <- 0 until semestresReprobadosGrupal.length) 
      if (semestresReprobadosGrupal(i)==semestresMasReprobadosGrupal) 
        listaDeSemestresMasReprobados += (i + 1).toByte
      
    listaDeSemestresMasReprobados
  }
}

object Actividad5_Clase_Alumnos {
  def main(args: Array[String]): Unit = {
    /*var cardex = new ListBuffer[ListBuffer[Byte]] 
    var semestre1, semestre2 = new ListBuffer[Byte]
    semestre1 += (100, 90, 0, 0, 90, 80)
    semestre2 += (70, 80, 90, 100, 90, 50)
    cardex += (semestre1, semestre2)
    val a = new Alumno("14070010", "David", "Fernandez", "Villarreal", 21, 7, "ISC", cardex)
    val a1 = new Alumno()
    println(a.obtenerCalifSemestresReprobados())
    println(a.obtenerRFC())*/
    
    val pa = new PruebaAlumnos()
    println("----------------------Alumno 1----------------------")
    println("Promedio General: " + pa.a1.obtenerPromedioGeneral())
    println("RFC: " + pa.a1.obtenerRFC())
    pa.a1.mostarCalifAprobatoriasYSemestre()
    println("----------------------Alumno 2----------------------")
    println("Promedio General: " + pa.a2.obtenerPromedioGeneral())
    println("RFC: " + pa.a2.obtenerRFC())
    pa.a2.mostarCalifAprobatoriasYSemestre()
    println("----------------------Alumno 3----------------------")
    println("Promedio General: " + pa.a3.obtenerPromedioGeneral())
    println("RFC: " + pa.a3.obtenerRFC())
    pa.a3.mostarCalifAprobatoriasYSemestre()
    println("----------------------Alumno 4----------------------")
    println("Promedio General: " + pa.a4.obtenerPromedioGeneral())
    println("RFC: " + pa.a4.obtenerRFC())
    pa.a4.mostarCalifAprobatoriasYSemestre()
    println("----------------------Alumno 5----------------------")
    println("Promedio General: " + pa.a5.obtenerPromedioGeneral())
    println("RFC: " + pa.a5.obtenerRFC())
    pa.a5.mostarCalifAprobatoriasYSemestre()
    
    println("Promedio general grupal: " + pa.obtenerPromedioGrupal())
    println("Semestres con mas reprobación: ")
    for(e <- pa.obtenerSemestresMasReprobados()) 
      print(e + ", ")
    println()
  } 
}