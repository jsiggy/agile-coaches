/*
 * ActionBasedCalculator
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.interfacesegregation;

public interface ActionBasedCalculator {
   double doSomeMath(Action action, long firstNumber, long secondNumber);
}
