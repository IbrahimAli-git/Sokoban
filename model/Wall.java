package com.codegym.task.task34.task3410.model;

import java.awt.*;

public class Wall extends CollisionObject {

    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.DARK_GRAY);

        int yy = getY();
        int xx = getX();
        int height = getHeight();
        int width = getWidth();


        graphics.fillOval(xx - width / 2, yy - height / 2, width, height);
    }
}
