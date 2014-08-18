package simpledesign.smells.calculator;

import simpledesign.smells.calculator.Calculator;

public class ArithmeticCalculator implements Calculator {
    @Override
    public long add(long firstNumber, long secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public long subtract(long firstNumber, long secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public long multiply(long operand1, long operand2) {
        return operand1 * operand2;
    }

    @Override
    public long divide(long operand1, long operand2) {
        return operand1 / operand2;
    }

    @Override
    public double sin(double value) {
        throw new RuntimeException("Trigonometric functions not supported");
    }

    @Override
    public double cos(double value) {
        throw new RuntimeException("Trigonometric functions not supported");
    }
}
