package siegjor.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;
import siegjor.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
