package com.codegym.task.task34.task3410.controller;

import com.codegym.task.task34.task3410.model.Direction;
import com.codegym.task.task34.task3410.model.GameObjects;
import com.codegym.task.task34.task3410.model.Model;
import com.codegym.task.task34.task3410.view.View;

public class Controller implements EventListener {
    View view;
    Model model;

    public Controller() {
        view = new View(this);
        model = new Model();
        view.init();
        model.restart();
    }

    @Override
    public void move(Direction direction) {

    }

    @Override
    public void restart() {

    }

    @Override
    public void startNextLevel() {

    }

    @Override
    public void levelCompleted(int level) {

    }

    public GameObjects getGameObjects() {
        return model.getGameObjects();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
    }
}
