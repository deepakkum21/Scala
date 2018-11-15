
// Currying function:
// It is the technique of transforming a function that takes multiple arguments
// into a function that takes a single argument
object CurryingFunctionDemo {

  // normal function with multiple argument
  def addNormal(val1: Int, val2: Int) = val1 + val2

  // currying function ---1st method
  def addCurrying1(val1: Int) = (val2: Int) => val1 + val2

  // currying function ---2nd method
  def addCurrying2(val1: Int)(val2: Int) = val1 + val2

  def main(args: Array[String]) {

    // with 1st method of currying
    println(addCurrying1(5)(6))

    // also can used with partial function
    // 1st argument
    var partialCurr60 = addCurrying1(20)
    // 2nd argument
    println("currying With partial function: " + partialCurr60(60))

    // with 2nd method of currying
    println(addCurrying2(50)(16))

    // partial function impl for 2nd method of currying for this have to use _
    var partialCurr80 = addCurrying2(20)_
    println("currying With partial function(method 2): " + partialCurr80(80))
  }
}