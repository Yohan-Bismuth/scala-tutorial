import java.util

object Helpers {
  implicit class IntWithTimes(x: Int) {
    def times[A](f : => A): Unit = {
      def loop(current: Int): Unit =
        if(current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}


object ImplicitExample extends App {

  import collection.JavaConverters._
  import Helpers._

  implicit val name: String = "default"

  def printMyName(implicit name: String) = {
    println(name)
  }

  def printMySurname(implicit surname: String) = {
    println(surname)
  }

  printMyName("Yohan")
  printMySurname("Bismuth")
  printMyName
  printMySurname

  implicit def javaToScalaStringListConverter(javaStringList: java.util.List[String]): List[String] = {
    javaStringList.asScala.toList
  }

  def myListPrinter(javaOrScalaList: List[String]) = {
    println(javaOrScalaList.mkString(" "))
  }

  val javaList: java.util.ArrayList[String] = new java.util.ArrayList[String]()
  javaList.add("I")
  javaList.add("am")
  javaList.add("java")
  javaList.add("list")

  val scalaList: List[String] = List("I", "am", "scala", "list")

  myListPrinter(javaList)
  myListPrinter(scalaList)

  5.times(println("Hello"))

  def myPrintln(string: String, string2:String) = {
    println(string + string2)
  }

  3.times[Unit](myPrintln("Salut ", "Toi"))
}
