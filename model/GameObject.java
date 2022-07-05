package com.codegym.task.task34.task3410.model;

import java.awt.*;

public abstract class GameObject {
    protected int x, y, width, height;
    public static int BOARD_CELL_SIZE = 20;

    public GameObject(int x, int t) {
        this.x = x;
        this.y = t;
        this.width = BOARD_CELL_SIZE;
        this.height = BOARD_CELL_SIZE;
    }

    public GameObject(int x, int t, int width, int height) {
        this.x = x;
        this.y = t;
        this.width = width;
        this.height = height;
    }

    public abstract void draw(Graphics graphics);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
