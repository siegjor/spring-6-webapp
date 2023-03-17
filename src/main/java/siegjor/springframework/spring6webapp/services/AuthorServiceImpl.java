package siegjor.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;
import siegjor.springframework.spring6webapp.domain.Author;
import siegjor.springframework.spring6webapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
    final private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
