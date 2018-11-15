

object FunctionDemo {

  // in scala functions are created using def keyword

  def add(operand1: Int, operand2: Int): Int = {
    return operand1 + operand2
  }

  // scala automatically returns value of last line so no need to mention return keyword
  def subtract(operand1: Int, operand2: Int): Int = {
    operand1 - operand2
  }

  def multiply(operand1: Int, operand2: Int): Int = operand1 * operand2

  def divide(operand1: Int, operand2: Int) = operand1 / operand2

  def squareNo(no: Int) = no * no

  // functions with default argument
  def addDefault(operand1: Int = 40, operand2: Int = 50) = operand1 + operand2

  // function with + or ** as function name it is not operator overloading
  def +(operand1: Int, operand2: Int) = operand1 + operand2

  def **(no: Int) = no * no

  def main(args: Array[String]) {
    println(add(45, 56));
    println(subtract(45, 56));
    println(multiply(45, 56));
    println(divide(45, 56));

    // since FunctionDemo is a Object so no need to create a object using new keyword
    // directly can call any member using Object name
    println(FunctionDemo.add(45, 56));
    //    println(FunctionDemo.subtract(45,56));
    //    println(FunctionDemo.multiply(45,56));
    //    println(FunctionDemo.divide(45,56));

    // if a function has only one argument
    println("if a function has only one argument");
    println(FunctionDemo squareNo 8)

    // for default function argument

    // override the 1st argument
    println(addDefault(45));
    // for override 2nd argument
    println(addDefault(operand2 = 45));

    println(FunctionDemo.+(45, 56));
    println(FunctionDemo ** 8)
    
    // anonymous function
    var anonymousFuncRes = (val1: Int, val2: Int) => val1 + val2
    println(anonymousFuncRes(5,15))

  }
}