package org.example.flyweight.Flyweight_17;

public class BuildingTile extends Tile {
    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getType() {
        return "building";
    }
}