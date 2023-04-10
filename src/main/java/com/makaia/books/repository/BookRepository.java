package com.makaia.books.repository;

import com.makaia.books.BooksApplication;
import com.makaia.books.model.Book;
import com.makaia.books.model.Rating;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final AuthorRepository authorRepository;
    private List<Book> books = new ArrayList<>();

    public BookRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findOne(Integer id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Book not found"));
    }



    @PostConstruct
    private void init() {
        
        final Logger logger = LogManager.getLogger(BooksApplication.class);

        logger.info("Loading of books has been started");
        books.add(new Book(1,"Reactive Spring", 484, Rating.FIVE_STARS, authorRepository.findByName("Josh Long")));
        books.add(new Book(2,"Spring Boot Up & Running", 328, Rating.FIVE_STARS, authorRepository.findByName("Mark Heckler")));
        books.add(new Book(3,"Hacking with Spring Boot 2.3", 392, Rating.FIVE_STARS, authorRepository.findByName("Greg Turnquist")));
        books.add(new Book(3,"Hacking with Spring Boot 2.4", 394, Rating.FOUR_STARS, authorRepository.findByName("Greg Turnquist")));

    }

}
