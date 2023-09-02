package org.example.basepatterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();

        System.out.println("--------------------------");
        Game chessgame = new ChessGame();
        chessgame.play();
    }
}
