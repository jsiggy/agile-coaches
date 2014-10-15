package simpledesign.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

   @Test
   public void shouldReturnFizzWhen3() {
      FizzBuzz fizzBuzz = new FizzBuzz();
      String result = fizzBuzz.calculateAnswer(3);

      assertEquals("expected Fizz when given 3", "Fizz", result);
   }

   @Test
   public void shouldReturnBuzzWhen5() {
      FizzBuzz fizzBuzz = new FizzBuzz();
      String result = fizzBuzz.calculateAnswer(5);

      assertEquals("expected Buzz when given number that is divisible by 5", "Buzz", result);
   }

   @Test
   public void shouldReturnFizzWhenDvisibleBy3() {
      FizzBuzz fizzBuzz = new FizzBuzz();
      String result = fizzBuzz.calculateAnswer(6);

      assertEquals("expected Fizz when given number that is divisible by 3", "Fizz", result);
   }

   @Test
   public void shouldReturnBuzzWhenDivisibleBy5() {
      FizzBuzz fizzBuzz = new FizzBuzz();
      String result = fizzBuzz.calculateAnswer(10);

      assertEquals("expected Buzz when given number that is divisible by 5", "Buzz", result);
   }

   @Test
   public void shouldReturnNumberIfNotDivisibleBy3AndNotDivisibleBy5() {
      int input = 1;
      FizzBuzz fizzBuzz = new FizzBuzz();
      String result = fizzBuzz.calculateAnswer(input);

      assertEquals("expected same number when given number not divisible by 3 or 5", String.valueOf(input), result);
   }

   @Test
   public void shouldReturnFizzBuzzIfDivisibleBy3And5() {
      FizzBuzz fizzBuzz = new FizzBuzz();
      String result = fizzBuzz.calculateAnswer(15);

      assertEquals("expected FizzBuzz when given number that is divisible by both 3 and 5", "FizzBuzz", result);
   }

   @Test
   public void shouldPrintTheResultToTheScreen() {
      FizzBuzz fizzBuzz = new FizzBuzz();
   }
}
