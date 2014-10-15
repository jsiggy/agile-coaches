package simpledesign.smells.domain;

public class Book {

    private final String isbn;
    private final String name;
    private final String author;

    public Book(String isbn, String name, String author) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
    }
}
