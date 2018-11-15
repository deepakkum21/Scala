

object StringInterpolation {
  def main(args: Array[String]) {
    val name = "deepak"
    val age = 18

    println("The name is: " + name + " and the age is: " + age)

    // 1st way of StringInterpolation
    // raw forces not to use escape sequences 
    // it prints as it is 
    println(raw"Hello \n World")

    // 2nd way of StringInterpolation
    println(s"The name is: $name and the age is: $age")

    // 3rd way of StringInterpolation
    println(f"The name is: $name%s and the age is: $age%d")
  }
}