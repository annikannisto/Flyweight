package org.example.flyweight.Flyweight_17;

import javafx.scene.canvas.GraphicsContext;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
        generateMap();
    }

    protected abstract void generateMap();

    public void render(GraphicsContext gc) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y].render(gc, x, y);
            }
        }
    }
}