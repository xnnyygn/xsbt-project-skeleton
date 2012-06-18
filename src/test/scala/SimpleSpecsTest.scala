import org.specs._

class SimpleSepcsTest extends Specification {
  
  "simple" should {

    "'Hello, world!' must has 13 characters" in {
      "Hello, world!".size must_== 13
    }

  }

}
