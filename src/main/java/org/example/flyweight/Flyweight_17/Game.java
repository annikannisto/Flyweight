package org.example.flyweight.Flyweight_17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("RPG Map");

        Canvas canvas = new Canvas(420, 420);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Map cityMap = new CityMap(20, 20);
        cityMap.render(gc);

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}