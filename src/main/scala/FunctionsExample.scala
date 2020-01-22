object FunctionsExample extends App {

  def apply(i : Int, fun: Int => Int) = {
    fun(i)
  }

  def add1(i : Int) = {
    i + 1
  }

  println(apply(10, add1))

  def printName(first: String, last: String) = {
    println(first + " " + last)
  }

  printName("John", "Smith") // Prints "John Smith"
  printName(first = "John", last = "Smith") // Prints "John Smith"
  printName(last = "Smith", first = "John") // Prints "John Smith"

  def printNameWithDefault(first: String = "John", last: String = "Smith") = {
    println(first + " " + last)
  }
  printNameWithDefault(last = "Jones") // Prints "John Jones"
}
