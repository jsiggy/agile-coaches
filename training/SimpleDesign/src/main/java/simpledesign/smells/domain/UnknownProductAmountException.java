package simpledesign.smells.domain;

import simpledesign.smells.thirdparty.AmazonInvalidProductAmountException;

public class UnknownProductAmountException extends RuntimeException {
   public UnknownProductAmountException(String message, AmazonInvalidProductAmountException e) {
      super(message, e);
   }
}
