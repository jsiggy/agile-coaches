/*
 * ScientificCalculator
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.opentoextensionclosedtomodification;

import simpledesign.solid.Calculator;

public interface ScientificCalculator extends Calculator{
   double sin(double value);
}
