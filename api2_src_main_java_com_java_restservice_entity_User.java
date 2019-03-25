package com.java.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User {

    @Id
    private String movie_title;
    private String rating;
    private String collection;
    private String year;

    public String getmovie_title() {
        return movie_title;
    }

    public void setmovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getrating() {
        return rating;
    }

    public void setrating(String rating) {
        this.rating = rating;
    }

    public String getcollection() {
        return collection;
    }

    public void setcollection(String collection) {
        this.collection = collection;
    }

    public String getyear() {
        return year;
    }

    public void setyear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" + "movie_title='" + movie_title + '\'' + ", rating='" + rating + '\'' + ", collection='" + collection + '\''
                + ", year='" + year + '\'' + '}';
    }
}