package org.example.flyweight.Flyweight_17;

public class SwampTile extends Tile {
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "swamp";
    }
}
