package com.hanan.ejcomposicion1;

public class BookTest {
    public static void main(String[] args) {
        Author author1 = new Author("Dante Allighieri", "dante@gmail.com", 'h');
        Book book1 = new Book("Divina Comedia", author1, 20);

        System.out.println(book1.toString());
    }
}
