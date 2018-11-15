

object ForLoopDemo {
  def main(args: Array[String]) {
    // 1st method
    for(i <- 1 to 5){
      println("1st method to use for using to " + i)
    }
    
    // 2nd method
    for(i <- 1.to(5)){
      println("2nd way: loop for using to() as method " + i)
    }
    
     // 3rd method
    for(i <- 1 until 5){
      println("3rd way: loop for using until " + i)
    }
    
    // 4th method
    for(i <- 1.until(5)){
      println("4th way: loop for using until() as method " + i)
    }
    
    // multiple ranges
    // nested for loop
    for(i <- 1 to 9; j <- 1 to 3){
      println("5th way: loop for using to as method with multiple ranges " + i + " "+ j)
    }
    
    // for operation on list
    var listFor = List(1,400,87,54,5,3,4,64,8,533);
    for( listValue <- listFor){
      println("list values: "+ listValue)
    }
    
    // applying filter on list in For
    for( listValue <- listFor; if listValue > 100){
      println("list values using filter in for loop: "+ listValue)
    }
    
    // returning list by using for loop
    var resultByFor = for{ listValue <- listFor; if listValue > 100 } yield { listValue/2 }
    println("returning value using for loop with yield: " + resultByFor) 
  }
}