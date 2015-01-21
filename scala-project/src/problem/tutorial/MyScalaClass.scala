package problem.tutorial

class MyScalaClass {
  // mutable variable
  var myField : Int = 0;
  
  // immutable variable
  val myInt = 10;
  val myVal = "Hello, Scala!";
  
  // constructor
  def this(value : Int) = {
    this();
    this.myField = value;
  }
  
  def getMyField() : Int = {
    return this.myField;
  }
  
  def addToMyField(value : Int) = {
    this.myField += value;
  }
}

// Scala classes cannot have static variables or methods
object Main {
  def main(args : Array[String]) {
    val myScalaClass = new MyScalaClass();
    
    myScalaClass.addToMyField(10);
    
    println("my field = " + myScalaClass.getMyField());
    
    Hello.hello();
    
    Hello.main(new Array[String](10));
    
    Hello.matrix()
  }
}

object Hello{
  
   // this method = void hello in java
   def hello( ) : Unit = {
      println("Hello, Scala!")
      
      var myArray : Array[String] = new Array[String](10);
      myArray(0) = "Zara"; myArray(1) = "Nuha"; myArray(6/2) = "Ayan"; // = myArray(3) = "Ayan"
      
      var z = Array("Zara", "Nuha", "Ayan");
      
      var in = Array(1.9, 2.9, 3.5);
      
      for (i <- myArray) {
        print(i + " ")
      }
      
      for (i <- 0 to (z.length - 1)) {
        print(z(i) + " ")
      }
      
      var max = in(0)
      for (i <- 1 to (in.length - 1)) {
        if (in(i) > max) max = in(i)
      }
      println("Max is " + max)
   }
   
   def matrix() : Unit = {
      var myMatrix = Array.ofDim[Int](3,3)
      
      // build a matrix
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            myMatrix(i)(j) = j;
         }
      }
      
      // Print two dimensional array
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            print(" " + myMatrix(i)(j));
         }
         println();
      }
   }
   
   def main(args : Array[String]) {
      println("Main hello")
   }
}