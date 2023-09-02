package org.example.basepatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {
    private final List<GameLevelMemento> gameLevelMementoList = new ArrayList<>();

    public void add(GameLevelMemento gameLevelMemento) {
        gameLevelMementoList.add(gameLevelMemento);
    }

    public GameLevelMemento get(int index) {
        return gameLevelMementoList.get(index);
    }
}
