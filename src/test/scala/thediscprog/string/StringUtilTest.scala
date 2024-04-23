package thediscprog.string

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StringUtilTest extends AnyFlatSpec with Matchers {

  it should "return false for null" in {
    StringUtil.isFieldDefined(null) shouldBe false
  }

  it should "return false for empty string" in {
    StringUtil.isFieldDefined("") shouldBe false
  }

  it should "return false for a string of empty spaces" in {
    StringUtil.isFieldDefined("   ") shouldBe false
  }

  it should "return true for a defined string" in {
    StringUtil.isFieldDefined("a") shouldBe true
  }
}
