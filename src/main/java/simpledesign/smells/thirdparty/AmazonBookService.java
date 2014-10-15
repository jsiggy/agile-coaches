package simpledesign.smells.thirdparty;

public class AmazonBookService {
    public boolean placeOrder(String productId, int amountOfProduct) throws AmazonInvalidProductAmountException, AmazonInvalidProductIdException {
        return false;
    }
}
