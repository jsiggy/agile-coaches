/*
 * SingleResponsibilityTest
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.opentoextensionclosedtomodification;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ScientificBasicCalculatorTest {

   private ScientificBasicCalculator calculator;

   @Before
   public void setUp() throws Exception {
      calculator = new ScientificBasicCalculator();
   }

   @Test
   public void sin() {
      assertEquals(0.9092974268256817, calculator.sin(2), 1);
   }
}
