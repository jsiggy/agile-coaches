/*
 * SingleResponsibilityTest
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.liskovsubstitution;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import simpledesign.solid.Calculator;

@RunWith(MockitoJUnitRunner.class)
public class AddingOnlyCalculatorTest {

  private Calculator calculator;

  @Before
  public void setUp() throws Exception {
    calculator = new AddingOnlyCalculator();
  }

  @Test
  public void add() {
     assertEquals(4, calculator.add(2, 2));
  }

  @Test
  public void subtract() {
     try{
        calculator.subtract(8,2);
        fail("Why would I throw an exception when the contract says subtract is supported.");
     } catch(RuntimeException e) {
        assertEquals("Ha, I fooled you...  You thought I would support subtraction, but you're wrong!  Ha, Ha, Ha", e.getMessage());
     }
  }
}
