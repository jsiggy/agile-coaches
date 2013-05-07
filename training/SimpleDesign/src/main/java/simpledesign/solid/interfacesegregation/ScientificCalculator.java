/*
 * SingleResponsibility
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.interfacesegregation;

import simpledesign.solid.Calculator;

public interface ScientificCalculator {
   long add(long firstNumber, long secondNumber);
   long subtract(long firstNumber, long secondNumber);
   double sin(double value);
}
