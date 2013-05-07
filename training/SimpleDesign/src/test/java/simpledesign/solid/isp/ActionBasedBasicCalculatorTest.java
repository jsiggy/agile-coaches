package simpledesign.solid.isp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ActionBasedBasicCalculatorTest {

   private ActionBasedCalculator calculator;

   @Before
   public void setUp() throws Exception {
      calculator = new ActionBasedBasicCalculator();
   }

   @Test
   public void add() {
      assertEquals(4, calculator.doSomeMath(Action.Add, 2, 2), 1.0);
   }

   @Test
   public void subtract() {
      assertEquals(6, calculator.doSomeMath(Action.Subtract, 8, 2), 1.0);
   }

   @Test
   public void sin() {
      assertEquals(0.9092974268256817, calculator.doSomeMath(Action.Sin, 2, 0), 1.0);
   }
}
