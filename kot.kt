fun main(args : Array<String>) {
  for (i in 1..45) {
    println("$i => ${fib(i)}")
  }
}

fun fib(iteration : Int) : Int {
  return if (iteration == 0 || iteration == 1) {
    1
  } else {
    fib(iteration - 1) + fib(iteration - 2)
  }
}
