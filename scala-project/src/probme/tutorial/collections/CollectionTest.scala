package probme.tutorial.collections

import java.util.Date

class CollectionTest {

  def testList(): String = {
    var x = List("A", "B")
    var data: Date = new Date()
    return new String("A")
  }

  def doSum(l: List[Int]): Int = {
    return l.sum;
  }

}

object CollectionTest {

  def main(args: Array[String]) {
    println(new CollectionTest().doSum(List(5,6,7)))
    
    import scala.collection.mutable  

    var immutableSet = Set(1, 2, 3)   

    immutableSet += 4   
    //this is the same as:  
    //immutableSet = immutableSet + 4  

    //compare to     
    val mutableSet = mutable.Set(1, 2, 3)    
    mutableSet += 4   
    // this is the same as:   
    //mutableSet.+=(4)  
    println(immutableSet, mutableSet)  
  }

}