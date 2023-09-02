package org.example.basepatterns.behavioral.template;

public class FootballGame extends Game{
    @Override
    protected void initialize() {
        System.out.println("Футбольная игра: инициализация");
    }

    @Override
    protected void startGame() {
        System.out.println("Футбольная игра: начало игры");
    }

}
