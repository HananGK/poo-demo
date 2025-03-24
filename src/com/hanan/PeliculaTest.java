package com.hanan;

public class PeliculaTest {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula();
        peli1.setTitle("Lord of the Rings");
        System.out.println(peli1.getTitle());
        peli1.setGenre("Fantasia");
        System.out.println(peli1.getGenre());
        peli1.setRating("La mejor del mundo");
        System.out.println(peli1.getRating());
        peli1.playIt();

        Pelicula peli2 = new Pelicula();
        peli2.setTitle("Star Wars");
        System.out.println(peli2.getTitle());
        peli2.setGenre("Ciencia Ficcion");
        System.out.println(peli2.getGenre());
        peli2.setRating("Obra maestra");
        System.out.println(peli2.getRating());
        peli2.playIt();

        Pelicula peli3 = new Pelicula();
        peli3.setTitle("Neverending Story");
        System.out.println(peli3.getTitle());
        peli3.setGenre("Fantasia");
        System.out.println(peli3.getGenre());
        peli3.setRating("Un bodrio");
        System.out.println(peli3.getRating());
        peli3.playIt();

    }
}
