package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
/*
public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        Group g = new Group();
        double bpmin = 2;
        int bpmax = 20;
        int bpmed = 12;
        int bpunterquart = 10;
        int bpoberquart = 13;
        final double initialSceneWidth = 600;
        final double initialSceneHeight = 600;
        final Scene scene = new Scene(g,initialSceneWidth, initialSceneHeight, Color.GRAY);
        scene.setFill(null);


        double min = initialSceneWidth/bpmin;
        double max = initialSceneWidth/bpmax;
        double med = initialSceneWidth/bpmed;
        double unterquart = initialSceneWidth/bpunterquart;
        double oberquart = initialSceneWidth/bpoberquart;

        Rectangle rectangle = new Rectangle();
        double recheight = initialSceneHeight/4;
        rectangle.setHeight(recheight);
        rectangle.setWidth(oberquart-unterquart);
        System.out.println(rectangle.getWidth());

        rectangle.setX(unterquart);
        rectangle.setY(300);

        g.getChildren().add(rectangle);


        Line line = new Line();
        line.setStartX(min);
        line.setStartY(0);
        line.setEndX(max);
        line.setEndY(0);

        g.getChildren().add(line);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}*/
