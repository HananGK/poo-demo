package com.hanan.abs;

public class AbstractTest {
    public static void main(String[] args) {
        Circulo circuloRojo = new Circulo(10.0, "Circulo", "Rojo");
        Triangle trianguloAzul = new Triangle("triangulo", "Azul", 6.4, 2.3);
        Rectangle rectanguloVerde = new Rectangle("rectangulo", "Verde", 8, 4.5);

        Forma[] formas = {circuloRojo, trianguloAzul, rectanguloVerde};

        for (Forma f : formas) {
            System.out.println("El área del "+ f.getNombre()+ " de color "
                    + f.getColor() + " es " +
                    String.format("%.2f", f.calcularArea()));
        }
    }
}
