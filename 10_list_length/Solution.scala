object Solution extends App {
  def f(arr: List[Int]) : Int = {
    // Count the number of elements in an array without using count, size or length operators
    arr.map(_ => 1).sum
  }

  println(f(List(1, 2, 3, 4)))
}
