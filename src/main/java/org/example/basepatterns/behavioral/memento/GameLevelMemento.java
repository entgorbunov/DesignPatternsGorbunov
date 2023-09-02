package org.example.basepatterns.behavioral.memento;

import lombok.Getter;

@Getter
public class GameLevelMemento {
    private final int levelNumber;
    private final int score;
    private final String checkPoint;

    public GameLevelMemento(int levelNumber, int score, String checkPoint) {
        this.levelNumber = levelNumber;
        this.score = score;
        this.checkPoint = checkPoint;
    }
}
