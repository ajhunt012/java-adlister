package com.codeup.adlister;

import java.io.Serializable;

public class Author implements Serializable {

    private long id;
    private String firstName;
    private String lastName;

    public Author(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(){

    }
}
