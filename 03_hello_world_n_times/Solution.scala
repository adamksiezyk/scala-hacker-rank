object Solution extends App {
  def f(n: Int) = {
    Range(0, n).map(_ => println("Hello World"))
  }

  var n = scala.io.StdIn.readInt
  f(n)
}
