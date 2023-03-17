package siegjor.springframework.spring6webapp.services;

import siegjor.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
