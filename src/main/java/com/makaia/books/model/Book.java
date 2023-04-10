package com.makaia.books.model;

public class Book {

    Integer id;
    String title;
    Integer pages;
    Rating rating;
    Author author;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPages() {
        return pages;
    }

    public Rating getRating() {
        return rating;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(Integer id, String title, Integer pages, Rating rating, Author author) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.rating = rating;
        this.author = author;
    }
}
