package com.makaia.books.model;

public class Author {

    Integer id;
    String firstName;
    String lastName;

    public String fullName(){
        return firstName + " " + lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
