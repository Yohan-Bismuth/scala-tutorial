object TypeClassExample extends App {
  import TypeClassExampleHelpers._
  implicit val inversibleString = new Inversible[String] {
    def inverse(input: String): String = input.reverse
  }

  implicit val inversibleRatio = new Inversible[Ratio] {
    def inverse(input: Ratio): Ratio = Ratio(input.denominator, input.nominator)
  }

  inversibleString.inverse("abcd")

  println(Ratio(2, 12).inverse)
}

object TypeClassExampleHelpers {
  // Regular type class
  implicit class InversibleObjectWrapper[A](a: A)(implicit inversible: Inversible[A]) {

    def inverse = inversible.inverse(a)

  }
}

trait Inversible[A] {
  def inverse(input: A): A
}

case class Ratio(nominator: Int, denominator: Int)