object OptionExample extends App {

  def maybeMultiplier(maybeInt : Option[Int]) = maybeInt match {
    case Some(x) => x * 2
    case None => 0
  }

  println(Some("Hello").map(str => str.toLowerCase()))
  println(None.map(_ => "pouet"))

  val optionalTeamList = List(Some("Amina"), Some("Laureen"), Some("Raphael"), Some("Sylvain"), None)
  println(optionalTeamList.flatten)

  println(Some(42).getOrElse("toto"))
  println(None.getOrElse("toto"))
}
