import org.scalatest._


/**
  * @author pvasilyev
  * @since 7/19/17
  */
class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}