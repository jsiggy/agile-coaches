/*
 * Square
 *
 * Copyright (c) 2010 Sabre Holdings, Inc. All Rights Reserved.
 */
package simpledesign.solid.liskovsubstitution;

public class Square extends Rectangle {
   @Override public long calculateArea() {
      return getWidth() * getWidth();
   }
}
