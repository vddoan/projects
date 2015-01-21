package probme.tutorial.game.mario

class Character(val n : String) {
  var name = n
  def hello = println("My name is " + name)
}

class Mario(val n : String) {
  var healthPoint = 10
  var money = 100
  var name = "Mario"
  
  def jump = println(name + " jumps !!!")
  
  def kiss(p : Princess) = println(name + " kisses " + p.name)
  
  def fight(e : Enemy) = println(name + " fights " + e.name)
  
  def fight(b : Boss) = println(name + " fights the boss " + b.name)
  
  def goToCastle = print(name + " goes to the castle !")
  
  def hit(s: String) = {
    println(s)
    healthPoint -= 1
  }
}

class Princess(n : String) extends Character(n)

class Enemy(n : String) extends Character(n)

class Boss(n : String) extends Character(n)
