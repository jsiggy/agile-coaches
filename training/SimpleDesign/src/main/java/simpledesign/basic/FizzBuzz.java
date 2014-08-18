package simpledesign.basic;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++)
            System.out.println(fizzBuzz.calculateAnswer(i));
    }

    public String calculateAnswer(int i) {
        boolean mod3 = i % 3 == 0;
        boolean mod5 = i % 5 == 0;
        String result = "";
        if (mod3)
            result = "Fizz";
        if (mod5)
            result += "Buzz";
        if (!mod3 && !mod5)
            result = String.valueOf(i);
        return result;
    }
}
