

object ClosureDemo {
  
  // A closure is function which uses one or more
  // variables declared outside that function
  
  // 2 types of closures (1) impure closure (2) pure closure
  
  // (1) Impure Closure - when the outside variable is of VAR type 
  var number = 100
  var impureClosure = (x: Int) => x + number  
  
   // (2) Pure Closure - when the outside variable is of VAL type 
  val num = 100
  var pureClosure = (x: Int) => x + num
  
  def main(args: Array[String]){
    println(impureClosure(20))
    println(pureClosure(50))
  }
}