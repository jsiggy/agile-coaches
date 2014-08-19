package simpledesign.smells;

import simpledesign.smells.domain.UnknownProductAmountException;
import simpledesign.smells.domain.UnknownProductIdException;
import simpledesign.smells.thirdparty.AmazonBookService;
import simpledesign.smells.thirdparty.AmazonInvalidProductAmountException;
import simpledesign.smells.thirdparty.AmazonInvalidProductIdException;

public class BookService {
   private AmazonBookService amazonBookService = new AmazonBookService();

    public boolean order(String productId, int amountOfProduct) {
        try {
           return amazonBookService.placeOrder(productId, amountOfProduct);
        } catch (AmazonInvalidProductIdException e) {
           throw new UnknownProductIdException("Bad product id " + productId, e);
        } catch (AmazonInvalidProductAmountException e) {
           throw new UnknownProductAmountException("Invalid amount of product requested " + productId, e);
        }
    }
}
