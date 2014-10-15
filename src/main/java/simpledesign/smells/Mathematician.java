package simpledesign.smells;

import simpledesign.smells.calculator.ArithmeticCalculator;

public class Mathematician {

    public long doSomeCrazyMath(long firstNumber, long secondNumber) {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        return calculator.add(firstNumber, calculator.subtract(calculator.add(5 * firstNumber, secondNumber), secondNumber));
    }
}
