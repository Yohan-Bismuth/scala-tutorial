object CurryingExample extends App {

  // (Int,Int) => Int
  def add1(a:Int,b:Int) : Int = {
    a + b
  }

  val toto: (Int, Int) => Int = add1
  println(add1(1,2))

  // Int => Int => Int
  def add2(a:Int)(b:Int): Int = {
    a + b
  }

  val tutu: Int => Int => Int = add2
  println(add2(1)(2))

  def inc(x: Int): Int = {
    x + 1
  }

  val add3 = add2(1)_
  println(add3(2))
}
