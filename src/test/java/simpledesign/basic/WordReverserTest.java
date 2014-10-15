package simpledesign.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordReverserTest {

   @Test(expected = RuntimeException.class)
   public void shouldThrowRuntimeExceptionWhenGivenNull() {
      WordReverser wordReverser = new WordReverser();

      wordReverser.reverseWordsInSentence(null);
   }

   @Test
   public void shouldReverseAllCharactersOfSingleWordSentence() {
      WordReverser wordReverser = new WordReverser();

      String result = wordReverser.reverseWordsInSentence("hello");

      assertEquals("olleh", result);
   }

   @Test
   public void shouldNotSplitSingleWordSentenceIntoWords() {
      WordReverser wordReverser = new WordReverser();

      String[] result = wordReverser.splitSentence("foo");

      assertEquals(1, result.length);
   }

   @Test
   public void shouldSplitSentenceIntoWords() {
      WordReverser wordReverser = new WordReverser();
      String[] result = wordReverser.splitSentence("foo bar baz zot");

      assertEquals(4, result.length);
   }

   @Test
   public void shouldReverseWordsButKeepWordsInSameOrderForTwoWordSentence() {
      WordReverser wordReverser = new WordReverser();
      String result = wordReverser.reverseWordsInSentence("hello joe");

      assertEquals("olleh eoj", result);
   }
}
