/*
 * OpenToExtensionClosedToModification
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.opentoextensionclosedtomodification;

import simpledesign.solid.singleresponsibility.BasicCalculator;

public class ScientificBasicCalculator extends BasicCalculator implements ScientificCalculator {
   public double sin(double value) {
      return Math.sin(value);
   }
}
