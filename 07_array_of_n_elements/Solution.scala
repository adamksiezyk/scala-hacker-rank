object Solution extends App {
  def f(num: Int) : List[Int] = Range(0, num).toList

  val num = 6
  val res = f(num)
  println(res)
}
