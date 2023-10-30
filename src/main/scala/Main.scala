// Scala program to illustrate the implementation of inheritance
import scala.collection.mutable.ArrayBuffer

// Base class
class Geeks1{
  var Name: String = "Ankita"
}

class Geeks2 extends Geeks1 // Derived class // Using extends keyword
{
  var Article_no: Int = 130
  def details() //method
  {
    println("Author name: " +Name);
    println("Total numbers of articles: " +Article_no);
  }
}

object Main  // Driver code
{
  def main(args: Array[String])
  {
   val ob = new Geeks2();  // Creating object of derived class
    ob.details();
  }

}
