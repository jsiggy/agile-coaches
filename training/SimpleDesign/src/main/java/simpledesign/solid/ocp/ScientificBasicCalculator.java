package simpledesign.solid.ocp;

import simpledesign.solid.srp.BasicCalculator;

public class ScientificBasicCalculator extends BasicCalculator implements ScientificCalculator {
   public double sin(double value) {
      return Math.sin(value);
   }
}
