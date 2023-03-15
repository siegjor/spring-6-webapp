package siegjor.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import siegjor.springframework.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
