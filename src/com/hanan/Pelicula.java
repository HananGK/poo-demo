package com.hanan;

public class Pelicula {
    private String title;
    private String genre;
    private String rating;

    public Pelicula(){

    }

    public void playIt(){
        System.out.println(title + " está empezando. ¡Disfruta de la peli!");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
