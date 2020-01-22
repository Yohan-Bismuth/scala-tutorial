object MapExample extends App {

  val a = Map("Y" -> "B", "A" -> "M", "S" -> "C")
  val b = Map("R" -> "W")

  println(a + ("R" -> "W"))
  println(a ++ b)

  println(a.get("Y"))
  println(a.getOrElse("Z", "Nope"))
  println(a - ("Y"))
  println(a)

  //Equality independant of order
  val myMap1 =
    Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
  val myMap2 =
    Map("WI" → "Wisconsin", "MI" → "Michigan", "IA" → "Iowa", "OH" → "Ohio")
  println(myMap1 == myMap2)
}
