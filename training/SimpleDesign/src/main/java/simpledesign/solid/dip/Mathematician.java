package simpledesign.solid.dip;

import simpledesign.solid.Calculator;

public class Mathematician {
   private Calculator calculator;

   public long doSomeCrazyMath(long firstNumber, long secondNumber) {
      return calculator.add(firstNumber, calculator.subtract(calculator.add(firstNumber, secondNumber), secondNumber));
   }

   public void setCalculator(Calculator calculator) {
      this.calculator = calculator;
   }
}
