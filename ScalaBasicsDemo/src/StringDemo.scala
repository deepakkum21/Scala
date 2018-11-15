

object StringDemo {
  var num1 = 101.25
  var num2 = 50
  var str1 = "deepak"
  
  def main(args: Array[String]){
    println(str1.length());
    
    // string format
    println("(%f --- %s --- %d)".format(num1,str1,num2));
    printf("(%f --- %s --- %d)",num1,str1,num2);
  }
}