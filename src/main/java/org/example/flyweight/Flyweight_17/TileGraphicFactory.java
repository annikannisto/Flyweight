package org.example.flyweight.Flyweight_17;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, String> tileImagePaths = new HashMap<>();
    private static final Map<String, Image> tileGraphics = new HashMap<>();

    static {
        tileImagePaths.put("swamp", "/img/dirt.png");
        tileImagePaths.put("water", "/img/water.png");
        tileImagePaths.put("forest", "/img/grass.png");
        tileImagePaths.put("road", "/img/road.png");
        tileImagePaths.put("building", "/img/building.png");
    }

    public static Image getTileGraphic(String type) {
        if (!tileGraphics.containsKey(type)) {
            String imagePath = tileImagePaths.get(type);
            if (imagePath == null) {
                throw new IllegalArgumentException("Image path not found for type: " + type);
            }
            var resource = TileGraphicFactory.class.getResource(imagePath);
            if (resource == null) {
                throw new IllegalArgumentException("Image resource not found: " + imagePath);
            }
            Image image = new Image(resource.toExternalForm());
            tileGraphics.put(type, image);
        }
        return tileGraphics.get(type);
    }
}