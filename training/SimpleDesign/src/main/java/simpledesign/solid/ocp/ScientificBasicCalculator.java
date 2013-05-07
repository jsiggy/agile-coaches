/*
 * OpenToExtensionClosedToModification
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.ocp;

import simpledesign.solid.srp.BasicCalculator;

public class ScientificBasicCalculator extends BasicCalculator implements ScientificCalculator {
   public double sin(double value) {
      return Math.sin(value);
   }
}
