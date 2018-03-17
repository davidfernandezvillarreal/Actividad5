import scala.collection.mutable.ListBuffer


class Paciente(nombre: String = "NA", primerAp: String = "NA", segundoAp: String = "NA", edad: Byte = 0, 
    fecha: ListBuffer[String] = null, horaDeRegistro: ListBuffer[String] = null, 
    nivelDeBienestar: ListBuffer[Byte] = null, temperatura: ListBuffer[Double] = null,
    humedad: ListBuffer[String] = null) {
  private var _nombre: String = ""
  private var _primerAp: String = ""
  private var _segundoAp: String = ""
  private var _edad: Byte = 0
  private var _fecha = new ListBuffer[String]
  private var _horaDeRegistro = new ListBuffer[String]
  private var _nivelDeBienestar = new ListBuffer[Byte]
  private var _temperatura = new ListBuffer[Double]
  private var _humedad = new ListBuffer[String]
  
  def nombre = _nombre
  def primerAp = _primerAp
  def segundoAp = _segundoAp
  def edad = _edad
  def fecha = _fecha
  def horaDeRegistro = _horaDeRegistro
  def nivelDeBienestar = _nivelDeBienestar
  def temperatura = _temperatura
  def humedad = _humedad
  
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
  def fecha_= (fecha: ListBuffer[String]): Unit = {
    _fecha = fecha
  }
  def horaDeRegistro_= (horaDeRegistro: ListBuffer[String]): Unit = {
    _horaDeRegistro = horaDeRegistro
  }
  def nivelDeBienestar_= (nivelDeBienestar: ListBuffer[Byte]): Unit = {
    _nivelDeBienestar = nivelDeBienestar
  }
  def temperatura_= (temperatura: ListBuffer[Double]): Unit = {
    _temperatura = temperatura
  }
  def humedad_= (humedad: ListBuffer[String]): Unit = {
    _humedad = humedad
  }
  
  def obtenerPromedioNivelDeBienestar(nivelDeBienestar: ListBuffer[Byte]): Double = {
    var sumatoria = 0
    
    for (e <- nivelDeBienestar)
      sumatoria += e
    val promedio = sumatoria/nivelDeBienestar.length
    
    promedio
  }
  
  def obtenerTemperaturaMayorYDatosCorrespondientes(temperatura: ListBuffer[Double], nivelDeBienestar: ListBuffer[Byte], 
      fecha: ListBuffer[String], horaDeRegistro: ListBuffer[String], humedad: ListBuffer[String]): ListBuffer[String] = {
    var lista = new ListBuffer[String]
    val tempOrdenada = temperatura.sorted(Ordering.Double.reverse)
    var mayor = 0
    for(i <- 0 until temperatura.length) {
      if(tempOrdenada(0)==temperatura(i))
        mayor = i
    }
    
    lista += (fecha(mayor), horaDeRegistro(mayor), nivelDeBienestar(mayor).toString(), temperatura(mayor).toString(), humedad(mayor))
    
    lista
  }
  
  def obtenerTemperaturaMenorYDatosCorrespondientes(temperatura: ListBuffer[Double], nivelDeBienestar: ListBuffer[Byte], 
      fecha: ListBuffer[String], horaDeRegistro: ListBuffer[String], humedad: ListBuffer[String]): ListBuffer[String] = {
    var lista = new ListBuffer[String]
    val tempOrdenada = temperatura.sorted
    var menor = 0
    for(i <- 0 until temperatura.length) {
      if(tempOrdenada(0)==temperatura(i))
        menor = i
    }
    
    lista += (fecha(menor), horaDeRegistro(menor), nivelDeBienestar(menor).toString(), temperatura(menor).toString(), humedad(menor))
    
    lista
  }
  
  /*def obtenerNivelDeBienestar5TemperaturaYHumedad(nivelDeBienestar: ListBuffer[Byte], temperatura: ListBuffer[Double], humedad: ListBuffer[String]): ListBuffer[String] = {
    var lista = new ListBuffer[String]
    val nivelOrdenado = nivelDeBienestar.sorted(Ordering.Byte.reverse)
    for(i <- 0 until temperatura.length) {
      for (j <- 0 until nivelOrdenado.length)
        if (nivelOrdenado(j)==5)
    }
  }*/
}

object ExParcial2 {
  def main(args: Array[String]): Unit = {
    var fecha = new ListBuffer[String]
    var horaDeRegistro = new ListBuffer[String]
    var nivelDeBienestar = new ListBuffer[Byte]
    var temperatura = new ListBuffer[Double]
    var humedad = new ListBuffer[String]
    fecha += ("15/03/2018", "30/06/2017", "01/01/2018")
    horaDeRegistro += ("12:09:25","15:43:09", "02:34:36")
    nivelDeBienestar += (3, 1, 5)
    temperatura += (36.5, 28.7, 20.4)
    humedad += ("70%", "90%", "40%")
    
    val p = new Paciente("David", "Fernandez", "Villarreal", 21, fecha, horaDeRegistro, nivelDeBienestar, temperatura, humedad)
    println(p.obtenerPromedioNivelDeBienestar(nivelDeBienestar))
    println(p.obtenerTemperaturaMayorYDatosCorrespondientes(temperatura, nivelDeBienestar, fecha, horaDeRegistro, humedad))
    println(p.obtenerTemperaturaMenorYDatosCorrespondientes(temperatura, nivelDeBienestar, fecha, horaDeRegistro, humedad))
    
    /*println("Ingrese una fecha: ")
    val fechaIngresada = readLine()
    
    for(i <- 0 until fecha.length) {
      if(fechaIngresada.equals(fecha(i))) {
        println(p.nombre)
        println(p.primerAp)
        println(p.segundoAp)
        println(p.edad)
        println(p.fecha(i))
        println(p.horaDeRegistro(i))
        println(p.nivelDeBienestar(i))
        println(p.temperatura(i))
        println(p.humedad(i))
      } 
    }
    println("Ingrese una hora: ")
    val horaIngresada = readLine()
    
    for(i <- 0 until horaDeRegistro.length) {
      if(horaIngresada.equals(horaDeRegistro(i))) {
        println(p.nombre)
        println(p.primerAp)
        println(p.segundoAp)
        println(p.edad)
        println(p.fecha(i))
        println(p.horaDeRegistro(i))
        println(p.nivelDeBienestar(i))
        println(p.temperatura(i))
        println(p.humedad(i))
      } 
    }*/
    
  }
}