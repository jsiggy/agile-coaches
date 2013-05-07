/*
 * SingleResponsibilityTest
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.dependencyinjection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import simpledesign.solid.Calculator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathematicianTest {
   private Mathematician mathematician;
   @Mock Calculator calculator;

   @Before
   public void setUp() throws Exception {
      mathematician = new Mathematician();
      mathematician.setCalculator(calculator);
   }

   @Test
   public void add() {
      when(calculator.add(3,4)).thenReturn(40l);
      when(calculator.subtract(40, 4)).thenReturn(235l);
      when(calculator.add(3, 235)).thenReturn(1234l);
      
      assertEquals(1234, mathematician.doSomeCrazyMath(3, 4));

      verify(calculator).add(3,4);
      verify(calculator).subtract(40,4);
      verify(calculator).add(3,235);
   }

}
