object Solution extends App {
  def f(arr: List[Int]) : List[Int] = {
    // Reverse the list without using 'reverse' function
    if (arr.length == 1) return List(arr.head)
    return arr.last :: f(arr.init)
  }

  val arr = List(1, 2, 3, 4)
  val res = f(arr)
  println(res)
}
