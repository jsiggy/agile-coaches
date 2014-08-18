package simpledesign.basic;

import org.junit.Test;
import simpledesign.basic.Reverser;

import static org.junit.Assert.*;

public class ReverserTest {

    public static final String ONE_CHAR_STRING = "a";
    public static final String EMPTY_STRING = "";

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowRuntimeExceptionWhenGivenANull() {
        Reverser reverser = new Reverser();
        reverser.reverse(null);
    }

    @Test
    public void shouldReturnEmptyStringWhenGivenEmptyString() {
        Reverser reverser = new Reverser();
        String result = reverser.reverse(EMPTY_STRING);

        assertEquals(EMPTY_STRING, result);
    }

    @Test
    public void shouldReturnSameStringForOneCharString() {
        Reverser reverser = new Reverser();
        String result = reverser.reverse(ONE_CHAR_STRING);

        assertEquals(ONE_CHAR_STRING, result);
    }

    @Test
    public void shouldReverseATwoCharString() {
        String stringToReverse = new String("ab");

        Reverser reverser = new Reverser();
        String result = reverser.reverse(stringToReverse);

        assertEquals("ba", result);
    }

    @Test
    public void shouldReverseARandomLengthString() {
        String stringToReverse = new String("abcdefghijklmnopqrstuvwxyz1234567890");

        Reverser reverser = new Reverser();
        String result = reverser.reverse(stringToReverse);
        System.out.println(result);
        assertEquals("0987654321zyxwvutsrqponmlkjihgfedcba", result);
    }
}