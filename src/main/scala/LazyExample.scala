object LazyExample extends App {
  fun1()
  fun2()

  def fun1() = {
    println("FUN1")
    val x = {
      println("x"); 15
    }
    lazy val y = {
      println("y"); 13
    }

    println("x value = " + x)
    val b = y
    println("b value = " + b)
  }

  def fun2() ={
    println("FUN2")

    val x = {
      println("x"); 15
    }
    val y = () => {
      println("y"); 13
    }

    println("x value = " + x)
    val b = y()
    println("b value = " + b)
  }

  // using scala std lib
  val numbers = Stream.from(1)
  def infiniteCounting(stream: Stream[Int]): Unit = {
    stream match {
      case Stream.Empty => println("You're officialy Chuck Norris")
      case hd#::tl => println(hd); println(hd); infiniteCounting(tl)
    }
  }

  infiniteCounting(numbers)
}
