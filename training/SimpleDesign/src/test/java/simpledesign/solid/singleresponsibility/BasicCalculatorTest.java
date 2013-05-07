/*
 * SingleResponsibilityTest
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.singleresponsibility;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import simpledesign.solid.Calculator;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BasicCalculatorTest {

  private Calculator calculator;

  @Before
  public void setUp() throws Exception {
    calculator = new BasicCalculator();
  }

  @Test
  public void add() {
     assertEquals(4, calculator.add(2, 2));
  }

  @Test
  public void subtract() {
    assertEquals(6, calculator.subtract(8, 2));
  }
}
