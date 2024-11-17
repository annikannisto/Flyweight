package org.example.flyweight.Flyweight_17;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Tile {
    public abstract char getCharacter();
    public abstract String getType();

    public void render(GraphicsContext gc, int x, int y) {
        Image image = TileGraphicFactory.getTileGraphic(getType());
        gc.drawImage(image, x * 32, y * 32);
    }
}