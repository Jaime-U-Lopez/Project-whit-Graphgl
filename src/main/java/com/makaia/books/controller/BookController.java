package com.makaia.books.controller;

import com.makaia.books.model.Book;
import com.makaia.books.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    //@SchemaMapping(typeName = Query, "allBooks")
    @QueryMapping
    public List<Book> allBooks(){
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book findOne(@Argument Integer id){
        return bookRepository.findOne(id);
    }


   /*
    @QueryMapping

    public Book findByTitle(@Argument String name){

        return bookRepository.findByTitle(name);
    }
*/


}
