package simpledesign.basic;

public class Reverser {

   public String reverse(String stringToReverse) {
      if (stringToReverse == null)
         throw new IllegalArgumentException("String to reverse cannot be null");
      char[] reversedArray = new char[stringToReverse.length()];
      for (int i = 0; i < stringToReverse.length(); i++) {
         reversedArray[i] = stringToReverse.charAt(stringToReverse.length() - (i + 1));
      }
      return String.valueOf(reversedArray);
   }
}
