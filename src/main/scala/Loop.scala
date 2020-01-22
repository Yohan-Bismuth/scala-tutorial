object Loop extends App {
  for( a <- 1 to 10){
    println( "Value of a: " + a );
  }

  val a = List(1,2,3)

  for (elem <- a){
    println(elem)
  }

  val b = Some("b")
  val c = Some("c")
  val d = None

  b.map(x => println(s"je suis $x"))
  c.map(x => println(s"je suis $x"))
  d.map(x => println(s"je suis $x"))

  for {
    xb <- b
    xc <- c
    xd <- d
  } yield println(s"je suis $xb$xc$xd")

}
