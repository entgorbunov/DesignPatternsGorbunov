package org.example.basepatterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameLevel {
    private int levelNumber;
    private int score;
    private String checkPoint;

    public void play() {
        System.out.println("Playing game level " + getLevelNumber());
    }

    public GameLevelMemento save() {
        return new GameLevelMemento(levelNumber, score, checkPoint);
    }

    public void restore(GameLevelMemento gameLevelMemento) {
        levelNumber = gameLevelMemento.getLevelNumber();
        score = gameLevelMemento.getScore();
        checkPoint = gameLevelMemento.getCheckPoint();
    }
}
