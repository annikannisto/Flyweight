package org.example.flyweight.Flyweight_17;

import java.util.Random;

public class CityMap extends Map {

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected void generateMap() {
        Random random = new Random();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int tileType = random.nextInt(3);
                switch (tileType) {
                    case 0: tiles[x][y] = new BuildingTile(); break;
                    case 1: tiles[x][y] = new RoadTile(); break;
                    case 2: tiles[x][y] = new ForestTile(); break;
                }
            }
        }
    }
}