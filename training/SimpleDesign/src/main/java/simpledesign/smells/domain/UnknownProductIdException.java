package simpledesign.smells.domain;

import simpledesign.smells.thirdparty.AmazonInvalidProductIdException;

public class UnknownProductIdException extends RuntimeException {
    public UnknownProductIdException(String s, AmazonInvalidProductIdException e) {
    }
}
