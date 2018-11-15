

object HigherOrderFunctionDemo {
  // higher order function are function that take function as argument and return function
  def math(var1: Double, var2: Double, func: (Double, Double) => Double) = func(var1, var2)

  def math1(var1: Double, var2: Double, var3: Double, func: (Double, Double) => Double) = func(func(var1, var2), var3)

  def main(args: Array[String]) {
    println(math(54, 65, (val1, val2) => val1 + val2));
    println(math(54, 65, (val1, val2) => val1 * val2));
    println(math(54, 65, (val1, val2) => val1 - val2));

    // for finding max or min
    println(math(54, 65, (val1, val2) => val1 max val2));
    println(math(54, 65, (val1, val2) => val1 min val2));

    // for
    println(math1(54, 65, 74, (val1, val2) => val1 + val2));
    println(math1(54, 65, 10, (val1, val2) => val1 * val2));
    println(math1(54, 65, 74, (val1, val2) => val1 max val2));
    println(math1(54, 65, 10, (val1, val2) => val1 min val2));
    
    // using wild cards _(something)
     println(math(54, 65, _ + _));
     println(math1(54, 65, 74, _ max _));

  }
}