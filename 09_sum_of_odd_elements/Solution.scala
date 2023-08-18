object Solution extends App {
  def f(arr: List[Int]) : Int = {
    arr.filter(_.abs % 2 == 1).sum
  }

  println(f(List(-1, 2, 3, 4)))
}
