import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

class FizzbuzzTestDrive {

  Fizzbuzz fizz = new Fizzbuzz();

  public static void main(String[] args) {
    FizzbuzzTestDrive tests = new FizzbuzzTestDrive();
    tests.divisibleBy3();
    tests.notDivisibleBy3();
  }

  @Test
  public void divisibleBy3() {
    assertEquals("should return true", fizz.isDivisibleBy3(3), true);
  }

  @Test
  public void notDivisibleBy3() {
    assertEquals("should return false", fizz.isDivisibleBy3(4), false);
  }

}
