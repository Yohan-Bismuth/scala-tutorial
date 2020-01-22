object ListExample {

  def main(args: Array[String]): Unit = {
    val a: List[Int] = List(1, 2, 3)
    val b: List[Int] = List(1, 2, 3)

    // eq tests ref equality (same object)
    println(a eq b)

    // == tests content equality
    println(a == b)

    // Nil lists are identical, always
    val c: List[String] = Nil
    val d: List[Int] = Nil

    println(c eq d)
    println(c == d)

    val e = List(1, 3, 5, 7, 9)
    println(e(2))

    // Immutable
    val f = e.filter(elem => elem == 5)
    println(e)
    println(f)

    // Usefull methods
    println(e.length)
    println(e.map(elem => elem + 1))
    println(e.filter(elem => elem == 5))
    println(e.foldLeft(1)((a, b) => a * b))
    println(e.head)
    println(e.tail)
    println(e.head :: e.tail)

    val g : List[Int] = a ++ e
    println(g)

    // flatmap + anonymous parameter
    val name = List("Yohan")
    println(name.flatMap(_.toLowerCase))
  }
}
