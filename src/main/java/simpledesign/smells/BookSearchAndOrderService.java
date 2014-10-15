package simpledesign.smells;

import simpledesign.smells.domain.*;
import simpledesign.smells.domain.BookSearchService;

import java.util.List;

public class BookSearchAndOrderService {

    private BookSearchService engine;
    private OrderService orderService;
    private ShoppingCart cart;

    public List<Book> findBooksByName(String name) {
        return engine.search(new Book(null, name, null));
    }

    public List<Book> findBooksByISBN(String isbn){
        return engine.search(new Book(isbn, null, null));
    }

    public List<Book> findBooksByAuthor(String author) {
        return engine.search(new Book(null, null, author));
    }

    public void addBookToCart(Book book) {
        cart.add(book);
    }

    public void removeBookFromCart(String isbn) {
        cart.remove(isbn);
    }

    public void checkout(String userId, ShoppingCart cart) {
        orderService.pay(userId, cart);
        cart.clear();
    }


    public void setEngine(BookSearchService engine) {
        this.engine = engine;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }
}
