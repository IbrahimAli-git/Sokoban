package com.codegym.task.task34.task3410.model;

import java.awt.*;

public class StorageLocation extends GameObject {
    public static final int SIZE = 2;
    public StorageLocation(int x, int y) {
        super(x, y, SIZE, SIZE);

    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        int yy = getY();
        int xx = getX();
        int height = getHeight();
        int width = getWidth();

        graphics.fillOval(xx - width / 2, yy - height / 2, width, height);
    }
}
