package simpledesign.solid.isp;

public class ActionBasedBasicCalculator implements ActionBasedCalculator {

   public double doSomeMath(Action action, long firstNumber, long secondNumber) {
      if (action.equals(Action.Add))
         return firstNumber + secondNumber;
      else if (action.equals(Action.Subtract))
         return firstNumber - secondNumber;
      else
         return Math.sin(firstNumber);
   }
}
