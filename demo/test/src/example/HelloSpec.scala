package example

import com.wix.accord._
import example.demo._
import org.scalatest._

class HelloSpec extends FunSuite with Matchers {

  test("Use the predefined validator") {
    val person = Person("", 15)
    val result = validate(person)
    assert(result == Success)
  }

}
