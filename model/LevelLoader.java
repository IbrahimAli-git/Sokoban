package com.codegym.task.task34.task3410.model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {

    public LevelLoader(Path levels) {
    }

    public GameObjects getLevel(int level){
        Set<Wall> walls = new HashSet<>();
        Set<Box> boxes = new HashSet<>();
        Set<StorageLocation> storageLocations = new HashSet<>();
        Player player;

        int x = Model.BOARD_CELL_SIZE/2;
        int y = Model.BOARD_CELL_SIZE/2;

        walls.add(new Wall(x, y));
        walls.add(new Wall(x, y));
        boxes.add(new Box(x, y));
        storageLocations.add(new StorageLocation(x, y));
        player = new Player(x, y);

        return new GameObjects(walls, boxes, storageLocations, player);
    }
}
