package com.hanan;

import java.util.ArrayList;
import java.util.List;

public class GuessGame {

    public GuessGame() {
    }

    public void startGame() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Player player3 = new Player("player3");

        List<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        int numSecreto = (int)(Math.random()*10);

        System.out.println("Bienvenidos al Guess Game. Teneis que adivinar un número del 0 al 9.");

        boolean ganado = false;

        while  (!ganado) {
            for  (Player player : players) {
                System.out.println("Introduce tu respuesta: ");
                int respuesta = player.guess();
                System.out.println(player.getName() + ": " + respuesta);
                if (respuesta == numSecreto) {
                    System.out.println("¡Enhorabuena! La respuesta es correcta, el jugador " + player.getName() + " ha acertado el numero " + numSecreto);
                    ganado = true;
                    break;
                }
            }
        }

    }
}
