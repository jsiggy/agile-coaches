package simpledesign.smells;

import simpledesign.smells.domain.UnknownProductIdException;
import simpledesign.smells.thirdparty.AmazonBookService;
import simpledesign.smells.thirdparty.AmazonInvalidProductAmountException;
import simpledesign.smells.thirdparty.AmazonInvalidProductIdException;

public class BookService {
    AmazonBookService amazonBookService;

    public boolean order(String productId, int amountOfProduct) {
        try {
            return new AmazonBookService().placeOrder(productId, amountOfProduct);
        } catch (AmazonInvalidProductIdException e) {
            throw new UnknownProductIdException("Bad product id " + productId, e);
        } catch (AmazonInvalidProductAmountException e) {
            System.out.println("**** Invalid amount requested");
        }
        return false;
    }
}
