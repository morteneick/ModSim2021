package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Boxplot extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        double minimum = 50;
        double maximum = 250;
        double quantile25 = 130;
        double quantile75 = 185;
        double median = 170;

        Group g = new Group();
        DropShadow dropShadow = new DropShadow();

        double width = 1000;
        double scaling = (width/(maximum*1.1));
        double drawMin = minimum*scaling;
        double drawQ1 = quantile25*scaling;
        double drawMed = median*scaling;
        double drawQ2 = quantile75*scaling;
        double drawMax = maximum*scaling;

        Rectangle box = new Rectangle(drawQ1, 50, drawQ2 - drawQ1, 100);
        box.setFill(Color.LIGHTBLUE);
        box.setEffect(dropShadow);

        Line scale = new Line(0, 200, width, 200);
        double m1 = width/2;
        Line text1 = new Line(m1,200-5,m1,200+5);

        Label lbiz = new Label("aLABEL");

        Line whiskerLeft = new Line(drawMin,100,drawQ1,100);
        Line whiskerRight = new Line(drawQ2,100,drawMax,100);
        Line whisker1 = new Line(drawMin,90,drawMin,110);
        Line whisker2 = new Line(drawMax,90,drawMax,110);
        Line medianLine = new Line(drawMed, 50, drawMed, 150);
        medianLine.setStroke(Color.RED);
        medianLine.setStrokeWidth(3.0f);

        g.getChildren().addAll(box, whiskerLeft,whiskerRight,scale,whisker1,whisker2,medianLine,text1);

        primaryStage.setTitle("Boxplot");
        primaryStage.setScene(new Scene(g, width, 250));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

/*
Vertikale streifen CHECK
Skalierung CHECK
Berechnung CHECK
Beschriftungen Unten
*/