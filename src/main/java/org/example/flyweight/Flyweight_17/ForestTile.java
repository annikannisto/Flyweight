package org.example.flyweight.Flyweight_17;

public class ForestTile extends Tile {
    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "forest";
    }
}