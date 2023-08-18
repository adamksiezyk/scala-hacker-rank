object Solution extends App {
  def f(delim: Int, arr: List[Int]) : List[Int] = {
    arr.filter(_ < delim)
  }

  val delim = 3
  val arr = List(2, 3, 4, 1, 6)
  val res = f(delim, arr)
  println(res)
}
