package simpledesign.solid.lsp;

public class Square extends Rectangle {
   @Override public long calculateArea() {
      return getWidth() * getWidth();
   }
}
