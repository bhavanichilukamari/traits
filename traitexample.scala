//To perform multiple inheritance in scala we have a concept called trait
//keyword used is trait ,it consists of methods which has some arguments and implementation

trait Printable{
  def print()
}
trait Printable2{
  def print2()
}

class A4 extends Printable with Printable2 { //multiple inheritance
  def print(){
    println("Hello")
  }
  def print2() {
    println("Hello2")
  }
}

object MainObject{
  def main(args:Array[String]){
    var a = new A4()
    a.print()
    a.print2()
  }
}