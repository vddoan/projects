package problem.tutorial

trait MyTrait1 {
  def isSimilar(x : Any) : Boolean
  def isNotSimilar(x : Any) : Boolean = !isSimilar(x)
}

trait MyTrait2 {
  def doThis(x : Any) = x
  def doThat(x : Any) = "not do This " + doThis(x)
}

trait MyTrait3 {
  def message(f : Any => String, arg : Any) = f(arg) + " my message"
}

class Point(val x : Int, val y : Int) extends MyTrait1 with MyTrait2 with MyTrait3 {
  
  def isSimilar(that : Any) : Boolean = {
       var p = that.asInstanceOf[Point] 
       return this.x == p.x && this.y == p.y 
  }    
}

object PointTest {
  def main (args : Array[String]) {
    val myPoint = new Point(20,30)
    println(myPoint.doThis(this))
    println(myPoint.doThat(this))
    
    val func = (that : Any) => {
      var p = that.asInstanceOf[Point] 
      val newPoint = new Point(p.x + 10, p.y + 10)
      newPoint.x + " " + newPoint.y
    } 
    
    var msg = myPoint.message(func, myPoint)
    println(msg)
  }
}