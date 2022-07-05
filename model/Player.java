package com.codegym.task.task34.task3410.model;

import java.awt.*;
import java.util.Collection;

public class Player extends CollisionObject implements Movable {


    public Player(int x, int t) {
        super(x, t);
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);

        int yy = getY();
        int xx = getX();
        int height = getHeight();
        int width = getWidth();


        graphics.fillOval(xx - width / 2, yy - height / 2, width, height);

    }
}
