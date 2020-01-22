object PolymorphismExample extends App {

  // returns the animal with the highest fitness
  def selection(a1: Animal, a2: Animal): Animal = {
    List(a1,a2).maxBy(animal => animal.fitness)
  }

  // returns the animal with the highest fitness among a given specy
  def specySelection[A <: Animal](a1: A, a2: A): A = {
    List(a1,a2).maxBy(animal => animal.fitness)
  }

  def printAnimalsFitness(animals: List[Animal]): Unit = {
    animals.foreach { animal =>
      println(animal.fitness)
    }
  }

  val cats: List[Cat] = List(Cat(10), Cat(20))
  val dogs: List[Dog] = List(Dog(30), Dog(40))


  printAnimalsFitness(cats)
  printAnimalsFitness(dogs)
}

abstract class Animal {
  def fitness: Int
}
case class Cat(fitness: Int) extends Animal
case class Dog(fitness: Int) extends Animal
