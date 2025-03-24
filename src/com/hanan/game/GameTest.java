package com.hanan.game;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bienvenido al juego. Elige una presa; ");
//        System.out.println("1. Bambi");
//        System.out.println("2. Conejo");
//        int opcionPresa = sc.nextInt();
//        System.out.println("Elige un depredador: ");
//        System.out.println("3. Lobo Feroz");
//        System.out.println("4. Hiena");
//        int opcionDepredador = sc.nextInt();
//        sc.close();


        Entorno entorno = new Entorno(new Paloma(), new Serpiente());
        entorno.jugar();
    }
}
