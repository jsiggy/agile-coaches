/*
 * AddingOnlyCalculator
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.liskovsubstitution;

import simpledesign.solid.Calculator;

public class AddingOnlyCalculator implements Calculator {

   public long add(long firstNumber, long secondNumber) {
      return firstNumber + secondNumber;
   }

   public long subtract(long firstNumber, long secondNumber) {
      throw new RuntimeException("Ha, I fooled you...  You thought I would support subtraction, but you're wrong!  Ha, Ha, Ha");
   }
}
