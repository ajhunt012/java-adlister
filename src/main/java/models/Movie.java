package models;

import java.io.Serializable;

public class Movie implements Serializable {

    private long id;
    private String title;
    private String description;
    private String genre;
    private int rating;
    private String moviePosterUrl;
//    private Director director; could use this to create a director class.

    public Movie(){

    }
}
