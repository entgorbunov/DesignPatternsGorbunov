package org.example.basepatterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        GameLevel gameLevel = new GameLevel();
        GameHistory gameHistory = new GameHistory();

        gameLevel.setLevelNumber(1);
        gameLevel.setScore(100);
        gameLevel.setCheckPoint("Level 1, CheckPoint 1");
        gameLevel.play();
        gameHistory.add(gameLevel.save());

        gameLevel.setLevelNumber(2);
        gameLevel.setScore(200);
        gameLevel.setCheckPoint("Level 2, CheckPoint 2");
        gameLevel.play();
        gameHistory.add(gameLevel.save());

        gameLevel.restore(gameHistory.get(0));
        System.out.println("Level: " + gameLevel.getLevelNumber());

    }
}
