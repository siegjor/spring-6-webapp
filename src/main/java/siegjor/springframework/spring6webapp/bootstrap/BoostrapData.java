package siegjor.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import siegjor.springframework.spring6webapp.domain.Author;
import siegjor.springframework.spring6webapp.domain.Book;
import siegjor.springframework.spring6webapp.repositories.AuthorRepository;
import siegjor.springframework.spring6webapp.repositories.BookRepository;

@Component
public class BoostrapData  implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BoostrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Author brandon = new Author();
        brandon.setFirstName("Brandon");
        brandon.setLastName("Sanderson");

        Book mistborn = new Book();
        mistborn.setTitle("The Final Empire");
        mistborn.setIsbn("365473");

        Book elantris = new Book();
        elantris.setTitle("Elantris");
        elantris.setIsbn("927832");

        Author brandonSaved = authorRepository.save(brandon);
        Book mistbornSaved = bookRepository.save(mistborn);
        Book elantrisSaved = bookRepository.save(elantris);

        Author jordan = new Author();
        jordan.setFirstName("Robert");
        jordan.setLastName("Jordan");

        Book wheel = new Book();
        wheel.setTitle("Wheel of Time");
        wheel.setIsbn("390672");

        Author jordanSaved = authorRepository.save(jordan);
        Book bookSaved = bookRepository.save(wheel);

        brandonSaved.getBooks().add(mistborn);
        brandonSaved.getBooks().add(elantris);
        jordanSaved.getBooks().add(wheel);

        authorRepository.save(jordan);
        authorRepository.save(brandon);

        System.out.println("In Boostrap");
        System.out.println("Books: " + bookRepository.count());
        System.out.println("Authors: " + authorRepository.count());
    }
}
