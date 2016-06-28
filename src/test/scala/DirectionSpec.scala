import org.scalatest._
import prop._

import Direction._

class DirectionSpec extends PropSpec with PropertyChecks with Matchers {

  property("East forward is the same as West backward") {
    forAll { (x: Int, y: Int) =>
      val actual = East.forward(Position(x, y))
      val expected = West.backward(Position(x, y))
      actual shouldBe expected
    }
  }

  property("North forward is the same as South backward") {
    forAll { (x: Int, y: Int) =>
      val actual = North.forward(Position(x, y))
      val expected = South.backward(Position(x, y))
      actual shouldBe expected
    }
  }

  property("East forward should leave the y-coordinate untouched") {
    forAll { (x: Int, y: Int) =>
      East.forward(Position(x, y)).y shouldBe y
    }
  }

  property("North forward should leave the x-coordinate untouched") {
    forAll { (x: Int, y: Int) =>
      North.forward(Position(x, y)).x shouldBe x
    }
  }

}
