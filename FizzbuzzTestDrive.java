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
    tests.divisibleBy5();
    tests.notDivisibleBy5();
    tests.divisibleBy();
    tests.notDivisibleBy();
    tests.divisibleBy15();
    tests.notDivisibleBy15();
  }

  @Test
  public void divisibleBy3() {
    assertEquals("should return true", fizz.isDivisibleBy3(3), true);
  }

  @Test
  public void notDivisibleBy3() {
    assertEquals("should return false", fizz.isDivisibleBy3(4), false);
  }

  @Test
  public void divisibleBy5() {
    assertEquals("should return true", fizz.isDivisibleBy5(5), true);
  }

  @Test
  public void notDivisibleBy5() {
    assertEquals("should return false", fizz.isDivisibleBy5(7), false);
  }

  @Test
  public void divisibleBy() {
    assertEquals("should return true", fizz.isDivisible(5,5), true);
  }

  @Test
  public void notDivisibleBy() {
    assertEquals("should return false", fizz.isDivisible(4,3), false);
  }

  @Test
  public void divisibleBy15() {
    assertEquals("should return true", fizz.isDivisibleBy15(15), true);
  }

  @Test
  public void notDivisibleBy15() {
    assertEquals("should return false", fizz.isDivisibleBy15(16), false);
  }

  @Test
  public void returnNumber() {
    assertEquals("should return number if not divisible by 3 or 5", fizz.checkNumber(2), "2");
  }

  @Test
  public void returnFizzbuzz() {
    assertEquals("should return fizzbuzz", fizz.checkNumber(15), "Fizzbuzz");
  }

  @Test
  public void returnFizz() {
    assertEquals("should return fizz", fizz.checkNumber(3), "Fizz");
  }

}
