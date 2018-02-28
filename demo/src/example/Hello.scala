package example

import com.wix.accord._
import com.wix.accord.dsl._

object demo {
  case class Person(name: String, age: Int)

  implicit val personValidator = validator[Person] { p =>
    p.name is notEmpty
    p.age should be >= 18
  }
}

object Hello extends App {

  import demo._

  val person = Person("", 15)

  val result = validate(person)

  println(result)

}
