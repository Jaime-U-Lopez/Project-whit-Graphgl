package com.makaia.books.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rating {
    FIVE_STARS("5"),
    FOUR_STARS("4"),
    THREE_STARS("3"),
    TWO_STARS("2"),
    ONE_STAR("1");

    private String star;

    Rating(String star){
        this.star = star;
    }

    @JsonValue
    public String getStar(){
        return star;
    }

}
