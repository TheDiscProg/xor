package io.github.thediscprog.simexfield

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SimexFieldUtilTest extends AnyFlatSpec with Matchers {

  it should "return false for null string test" in {
    SimexFieldUtil.isFieldDefined(null) shouldBe false
  }

  it should "return false for empty simexfield string test" in {
    SimexFieldUtil.isFieldDefined("") shouldBe false
  }

  it should "return false for a simexfield of empty spaces string test" in {
    SimexFieldUtil.isFieldDefined("   ") shouldBe false
  }

  it should "return true for a defined simexfield string test" in {
    SimexFieldUtil.isFieldDefined("a") shouldBe true
  }

  it should "return false for a null entity in entity test" in {
    SimexFieldUtil.isFieldDefined[A](null) shouldBe false
  }

  it should "return true for a defined entity in entity test" in {
    SimexFieldUtil.isFieldDefined[A](A(1))
  }

  private case class A(a: Int)
}
