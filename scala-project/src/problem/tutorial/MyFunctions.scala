package problem.tutorial

class MyFunctions {
  def myAnonymousFunction(f : (Int, Int) => Int) = f(1,2)
  
  def myAnonymousFunction1(f : (Int, String) => String) = f(1, "abc")
  
  def myAnonymousFunctionWithArgs(f : (Int, String) => String, arg1 : Int, arg2 : String) = f(arg1, arg2) + " !!! "
  
  def myAdd(x : Int, y : Int) = x + y
  
  def swap(x : Any, y : Any) = (y, x)
  
  def loopWithoutLoop(n : Int) : Int = {
    return (0 until n).sum 
  }
  
  def matching(x : String) : String = {
    var selection = ""
    selection match {
      case "One" => "Click button 1"
      case "Two" => "Click button 2"
      case _ => "Standby"  
    }
    return selection
  }
}

object MyFunctions {
  def main(args : Array[String]) {
    
    val test = new MyFunctions()
    
    val call1 = test.myAnonymousFunction((x, y) => x + y)    
    
    val call2 = test.myAnonymousFunction((x: Int, y : Int) => x - y)
    
    val call3 = test.myAdd(1, 5)
    
    val call4 = test.myAnonymousFunction1((x, y) => x + " !!! " + y)
    
    val abc = (x : Int, y : String) => x + " and " + y  
    
    val call5 = test.myAnonymousFunctionWithArgs(abc, 1, "My Scala")
    
    print("call1 = " + call1 + ", call2 = " + call2 + ", call3 = " + call3 + ", call4 = " + call4 + ", call5 = " + call5)
    
    val (a, b) = test.swap("First", "Second")
    
    print(a, b)
    
    print(test.loopWithoutLoop(10))
  }
}