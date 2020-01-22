class MoreComplex(real: Double, imaginary: Double) extends Complex(real: Double, imaginary: Double){
  override def re() = real - real + real
}