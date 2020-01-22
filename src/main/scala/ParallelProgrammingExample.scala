import scala.collection.parallel.mutable.ParArray

object ParallelProgrammingExample extends App {
  val range = List.range(1,1000000)

  val pa = range.toParArray
  val a = range.toArray

  val start2 = System.currentTimeMillis()
  println(pa.reduce(_ + _))
  val end2 = System.currentTimeMillis()

  println("parallel reduce " + (end2 - start2) + " ms")

  val start = System.currentTimeMillis()
  println(a.reduce(_ + _))
  val end = System.currentTimeMillis()

  println("regular reduce " + (end - start) + " ms")

}