package simpledesign.smells.domain;

import java.util.List;

public interface BookSearchService {
    List<Book> search(Book book);
}
