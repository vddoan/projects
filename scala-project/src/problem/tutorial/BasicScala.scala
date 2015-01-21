package problem.tutorial

class GenericTechnique {
  def doGeneric() = print("Generic Technique")
}

object GenericTechnique {
  def testGeneric[A <: {def doGeneric() : Unit}, B](o1 : A)(f : A => B) : B = {
    f.apply(o1)
  }
  
  def main(args : Array[String]) {
    val test = new GenericTechnique()
    var msg = testGeneric(test){ test => 
          {
            "123"
          }
        }
    print(msg)
    
    val func2 = (a : GenericTechnique) => {"123456"}

    msg = testGeneric(test)(func2)
    print(msg)
  }
}

class CurryingTechnique {
  def doCurrying() : Unit = { print("Currying Technique") }
}

object CurryingTechnique {
  
  def testCurrying(o1 : {def doCurrying() : Unit}) (o2 : {def doCurrying() : Unit} => Unit)
  {
    println(o1.doCurrying())
    println(o2.apply(o1))
  }
  
  def add(x : Int, y : Int) = x + y
  
  def add1(x : Int) (y : Int) = x + y
  
  def add2(x : Int) = (y : Int) => x + y
  
  def main (args : Array[String]) {
    println(add(1,8))
    println(add1(1)(8))
    println(add2(1)(8))
    val curry = new CurryingTechnique()
    testCurrying(new CurryingTechnique())(curry => print("new Currying"))
  }
  
}

object BigDuck {
  def quack(value : String) = value.toUpperCase()
}

object SmallDuck {
  def quack(value : String) = value.toLowerCase()
}

object Swan {
  def quack(value : String) = "I am a swan"
}

object DuckTyping {
  def quacker(duck : {def quack(value : String) : String}) = println(duck.quack("Quack"))
  
  def main(args : Array[String]) {
    quacker(BigDuck)
    quacker(SmallDuck)
    quacker(Swan)
  }
}

object CallByNameInScala {
  val log = false
  def message(msg: String) = if (log) print(msg)
  
  def main(args : Array[String]) {
    val msg = "programing is running ..."
    message(msg + 1/0)
  }
}

object Factorial {
  def main(args : Array[String]) {
    println("factorial = " + factorial(4))
  }
  
  def factorial(x : Int) : Int = if (x == 0) 1 else x * factorial(x-1) 
}


object Fibonacci {
  def main(args : Array[String]) {
    for (n <- 1 until 10)
      print(fibonacci(n) + " ")
  }
  
  def fibonacci(x : Int) : Int = {
     if (x < 3) return x
     else return (fibonacci(x-1) + fibonacci(x-2))
  }  
}


class AnonymousFunction {
  def generic2ArgsFunction(f : (Any, Any) => String, arg1 : Any, arg2 : Any) = f(arg1, arg2)
  
}

object AnonymousFunction {
  def main(args : Array[String]) {
    var myFunctionInRunTime = (x : Any, y : Any) => x + " and " + y
    print(new AnonymousFunction().generic2ArgsFunction(myFunctionInRunTime, "Scala", "Me"))
  }
}