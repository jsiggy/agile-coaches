package simpledesign.smells.domain;

public interface OrderService {
    void pay(String userId, ShoppingCart cart);
}
