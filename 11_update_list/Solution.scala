object Solution extends App {
  def f(arr: List[Int]) : List[Int] = arr.map(_.abs)

  println(f(List(-1, 2, -3, 4)))
}
