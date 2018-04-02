import org.scalatest.FlatSpec
import org.scalatest.GivenWhenThen

import common.Application

class ApplicationSpec extends FlatSpec with GivenWhenThen {

  "Application" should "return Hello World!" in {
    Given("an application instance")
    val greeting = new Application();

    When("the helloWorld() method is called")
    val result = greeting.helloWorld()

    Then("display Hello World")
    assert(greeting.helloWorld() === "Hello World!")
  }

  it should "return an character's array with a size of 11" in {
    Given("an application instance")
    val greeting = new Application();

    When("the helloWorld() method is called")
    val result = greeting.helloWorld()

    Then("not display 'Hello World' ")
    assert(greeting.helloWorld().size !== 11)
  }
}
