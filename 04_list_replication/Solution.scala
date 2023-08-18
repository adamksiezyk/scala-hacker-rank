object Solution extends App {
  def f(num: Int, arr: List[Int]) : List[Int] = {
    arr.flatMap(List.fill(num)(_))
  }

  val num = 3
  val arr = List(1, 2, 3)
  val res = f(num, arr)
  println(res)
}
