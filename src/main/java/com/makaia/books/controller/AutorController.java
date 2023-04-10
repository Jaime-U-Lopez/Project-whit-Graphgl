package com.makaia.books.controller;


import com.makaia.books.model.Author;
import com.makaia.books.repository.AuthorRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AutorController {


    private AuthorRepository authorRepository;

    public AutorController( AuthorRepository authorRepository){
        this.authorRepository=authorRepository;
    }



    @QueryMapping

    public List<Author> autorAll(){

        return this.authorRepository.findAll();
    }



    @QueryMapping
    public Author getAutor(@Argument Integer id){

        return this.authorRepository.findById(id);
    }

    @QueryMapping
    public Author findByLastName(@Argument String lastName){

        return this.authorRepository.findByLastName(lastName);

    }


}
