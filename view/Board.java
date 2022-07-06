package com.codegym.task.task34.task3410.view;

import com.codegym.task.task34.task3410.controller.EventListener;
import com.codegym.task.task34.task3410.model.Direction;
import com.codegym.task.task34.task3410.model.GameObject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel {
    View view;
    protected EventListener eventListener;

    public Board(View view){
        this.view = view;
        KeyHandler keyHandler = new KeyHandler();
        addKeyListener(keyHandler);
        setFocusable(true);
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (GameObject gameObject : view.getGameObjects().getAll()) {
            gameObject.draw(g);
        }
    }

    public class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_LEFT){
                eventListener.move(Direction.LEFT);
            } else if (keyCode == KeyEvent.VK_RIGHT){
                eventListener.move(Direction.RIGHT);
            } else if (keyCode == KeyEvent.VK_UP){
                eventListener.move(Direction.UP);
            } else if (keyCode == KeyEvent.VK_DOWN){
                eventListener.move(Direction.DOWN);
            } else if (keyCode == KeyEvent.VK_R){
                eventListener.restart();
            }
        }
    }
}
