package com.codegym.task.task34.task3410.model;

import com.codegym.task.task34.task3410.controller.EventListener;

import java.net.URISyntaxException;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class Model {
    public static final int BOARD_CELL_SIZE = 20;
    protected EventListener eventListener;
    private GameObjects gameObjects;
    private int currentLevel = 1;
    LevelLoader levelLoader;

    public Model() {
        try {
            levelLoader = new LevelLoader(Paths.get(getClass().getResource("../res/levels.txt").toURI()));
        } catch (URISyntaxException ignore) {

        }
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public GameObjects getGameObjects(){
        return gameObjects;
    }

    public void restartLevel(int level){
         gameObjects = levelLoader.getLevel(level);
    }

    public void restart(){
        restartLevel(currentLevel);
    }

    public void startNextLevel(){
        currentLevel++;
        restartLevel(currentLevel);
    }
}
