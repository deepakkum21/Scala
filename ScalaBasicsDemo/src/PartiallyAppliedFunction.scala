import java.util.Date

// Partially Applied Function
object PartiallyAppliedFunction {

  def log(newDate: Date, message: String) = {
    println(newDate + " " + message)
  }

  def main(args: Array[String]) {
    // Fully Applied Function
    // When all the arguments are provided to the function
    val sum = (a: Int, b: Int) => a + b
    println(sum(40, 10))

    // partially applied function
    // when we use wild card
    val add = (a: Int, b: Int, c: Int) => a + b + c
    val partialFunc = add(10, 20, _: Int)
    // give the rest of argument now
    println(partialFunc(50))

    val partialFunc1 = add(10, _: Int, _: Int)
    // give the rest of argument now
    println(partialFunc1(50, 140))

    val newLog = log(new Date, _: String);
    newLog("this is the 1st log");
  }

}