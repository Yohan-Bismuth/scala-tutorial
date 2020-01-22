import scala.collection.immutable.HashSet

object CaseClassExample extends App {

  case class Person(name: String, surname: String)

  val actorNames = HashSet("Dwayne", "Chuck", "Sylvester")
  val actorSurnames = HashSet("Johnson", "Norris", "Stalone")

  def isActor(person: Person) = person match {
    case Person(name, surname) => actorNames.contains(name) && actorSurnames.contains(surname)
    case _ => false
  }

  println(isActor(Person("Chuck", "Norris")))
  println(isActor(Person("Dali", "Kilani")))
}
