package simpledesign.smells.domain;

public interface ShoppingCart {

    void add(Book book);

    void remove(String itemId);

    void clear();
}
