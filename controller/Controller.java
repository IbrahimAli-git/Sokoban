package com.codegym.task.task34.task3410.controller;

import com.codegym.task.task34.task3410.model.Model;
import com.codegym.task.task34.task3410.view.View;

public class Controller {
    View view;
    Model model;

    public Controller() {
        view = new View(this);
        model = new Model();
    }

    public static void main(String[] args) {

    }
}
