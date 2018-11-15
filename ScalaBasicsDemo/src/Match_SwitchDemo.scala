
// match expression are like switch case in java i.e. for multiple if
object Match_SwitchDemo {
  def main(args: Array[String]) {

    var age = 23
    var ageMessage = "Age is "

    age match {
      case 18 => println(ageMessage + age)
      case 20 => println(ageMessage + age)
      case 22 => println(ageMessage + age)
      case 23 => println(ageMessage + age)
      case 24 => println(ageMessage + age)
      case 50 => println(ageMessage + age)

      // default case
      case _  => println(ageMessage + "dafault")
    }

    // multiple condition for case
    var no = 9
    var noMessage = " is "
    no match {
      case 1 | 3 | 5 | 7 | 9 => println(no + noMessage + "odd")
      case 2 | 4 | 6 | 8 | 10 => println(no + noMessage + "even")
      // default case
      case _                 => println("dafault")
    }
    
    // match as expression
    var noMatchResult = no match {
      case 1 | 3 | 5 | 7 | 9 => "odd"
      case 2 | 4 | 6 | 8 | 10 => "even"
      // default case
      case _                 => "dafault"
    }
    
    println(noMatchResult)
  }
}