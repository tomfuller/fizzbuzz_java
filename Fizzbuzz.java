class Fizzbuzz {

  public boolean isDivisibleBy3(int number) {
    return isDivisible(number, 3);
  }

  public boolean isDivisibleBy5(int number) {
    return isDivisible(number, 5);
  }

  public boolean isDivisible(int number, int divisor) {
    if(number % divisor == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public boolean isDivisibleBy15(int number) {
    return isDivisible(number, 15);
  }

  public String checkNumber(int number) {
    if(isDivisibleBy15(number)) {
      return "Fizzbuzz";
    }
    else if(isDivisibleBy3(number)) {
      return "Fizz";
    }
    else if(isDivisibleBy5(number)) {
      return "Buzz";
    }
    else {
      return number + "";
    }
  }

}
