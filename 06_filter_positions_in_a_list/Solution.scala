object Solution extends App {
  def f(arr: List[Int]) : List[Int] = {
    arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
  }

  val arr = List(1, 2, 3, 4)
  val res = f(arr)
  println(res)
}
