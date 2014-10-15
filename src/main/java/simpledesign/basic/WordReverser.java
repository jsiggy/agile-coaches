package simpledesign.basic;

public class WordReverser {
   public String reverseWordsInSentence(String sentence) {
      if (sentence == null)
         throw new RuntimeException("sentence to reverseWordsInSentence must be non-null");
      Reverser reverser = new Reverser();
      String[] words = splitSentence(sentence);
      StringBuilder reversedSentenceBuffer = new StringBuilder();
      for (int i = 0; i < words.length; i++) {
         String reversedWord = reverser.reverse(words[i]);
         reversedSentenceBuffer.append(reversedWord);
         if (i < words.length-1)
            reversedSentenceBuffer.append(" ");
      }
      return reversedSentenceBuffer.toString();
   }

   String[] splitSentence(String sentence) {
      return sentence.split(" ");
   }
}
