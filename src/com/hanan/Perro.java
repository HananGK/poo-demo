package com.hanan;

public class Perro {

    private String size;
    private String breed;
    private String name;

    public Perro(){

    }

    public void bark(){
        System.out.println(name + " dice Guau!");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
