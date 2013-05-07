/*
 * SingleResponsibility
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.srp;

import simpledesign.solid.Calculator;

public class BasicCalculator implements Calculator {
   public long add(long firstNumber, long secondNumber) {
      return firstNumber + secondNumber;
   }

   public long subtract(long firstNumber, long secondNumber) {
      return firstNumber - secondNumber;
   }
}
