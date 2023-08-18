object Solution extends App {
  def fact(num: Int) : Int = {
    if (num == 0) return 1
    return num * fact(num - 1)
  }

  def e(num: Int, x: Double) : Double = {
    val pow_x = scala.math.pow(x, _)
    Range(0, num).map(i => pow_x(i) / fact(i)).sum
  }

  println(e(10, 20.0))
}

