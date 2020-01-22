object PatternMatchingExample extends App {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many" // case _ will trigger if all other cases fail.
  }
  print(matchTest(3)) // prints "many"

  // also works with variable affectation

  val foo = "foo"
  val bar = foo match {
    case "foo" => "bar"
    case _ => "gee"
  }

  print(bar) // prints bar

  val stuff = "blue"

  val myStuff = stuff match {
    case "red" ⇒ (255, 0, 0)
    case "green" ⇒ (0, 255, 0)
    case "blue" ⇒ (0, 0, 255)
    case _ ⇒ println(stuff); 0
  }

  def goldilocks(expr: Any) = expr match {
    case ("porridge", "Papa") ⇒ "Papa eating porridge"
    case ("porridge", "Mama") ⇒ "Mama eating porridge"
    case ("porridge", "Baby") ⇒ "Baby eating porridge"
    case _ ⇒ "what?"
  }

  def integerDoubler(expr: Any) : Int = expr match {
    case (s:String) => 0
    case (i:Int) => i * 2
    case _ => 1
  }

  println(integerDoubler(5))

  val pouet = "pouet"

  def matcherWithoutShadowing(expr: Any) : Int = expr match {
    case `pouet` => 3
    case (i:Int) => i * 2
    case _ => 1
  }

  println(matcherWithoutShadowing(pouet))

  def containsInt(list: List[Int], elem : Int): Boolean = list match {
    case hd::tl if hd == elem => true
    case hd::tl => containsInt(tl, elem)
    case Nil => false
  }

  println(containsInt(List(1,5,13), 5))
  println(containsInt(List(1,5,13), 8))

}