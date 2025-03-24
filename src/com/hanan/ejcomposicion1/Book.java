package com.hanan.ejcomposicion1;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int quantity = 0;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, Author author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.toString() +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
