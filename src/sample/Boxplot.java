package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;
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

        //Scaling
        double width = 1000;
        double scaling = (width/(maximum*1.1));
        double drawMin = minimum*scaling;
        double drawQ1 = quantile25*scaling;
        double drawMed = median*scaling;
        double drawQ2 = quantile75*scaling;
        double drawMax = maximum*scaling;
        double xaxis = 200;

        Rectangle box = new Rectangle(drawQ1, 50, drawQ2 - drawQ1, 100);
        box.setFill(Color.LIGHTBLUE);
        box.setEffect(dropShadow);

        //drawing
        Line whiskerLeft = new Line(drawMin,100,drawQ1,100);
        Line whiskerRight = new Line(drawQ2,100,drawMax,100);
        Line whisker1 = new Line(drawMin,90,drawMin,110);
        Line whisker2 = new Line(drawMax,90,drawMax,110);
        Line medianLine = new Line(drawMed, 50, drawMed, 150);
        medianLine.setStroke(Color.RED);
        medianLine.setStrokeWidth(3.0f);
        Line scale = new Line(0, xaxis, width, xaxis);

        //Min Max Median Beschriftungen
        Line scaleMin = new Line(drawMin,xaxis-5,drawMin,xaxis+5);
        Line scaleMax = new Line(drawMax,xaxis-5,drawMax,xaxis+5);
        Line scaleMed = new Line(drawMed,xaxis-5,drawMed,xaxis+5);
        Line scaleQ1 = new Line(drawQ1,xaxis-5,drawQ1,xaxis+5);
        Line scaleQ2 = new Line(drawQ2,xaxis-5,drawQ2,xaxis+5);

        Label labelMin = new Label(""+minimum);
        labelMin.setTranslateX(drawMin-10);
        labelMin.setTranslateY(xaxis+5);

        Label labelMax = new Label(""+maximum);
        labelMax.setTranslateX(drawMax-10);
        labelMax.setTranslateY(xaxis+5);

        Label labelMed = new Label(""+median);
        labelMed.setTranslateX(drawMed-10);
        labelMed.setTranslateY(xaxis+5);

        Label labelQ25 = new Label(""+quantile25);
        labelQ25.setTranslateX(drawQ1-10);
        labelQ25.setTranslateY(xaxis+5);

        Label labelQ75 = new Label(""+quantile75);
        labelQ75.setTranslateX(drawQ2-10);
        labelQ75.setTranslateY(xaxis+5);

        g.getChildren().addAll(box, whiskerLeft,whiskerRight,scale,whisker1,whisker2,medianLine,
                scaleMin,scaleMax,scaleMed,scaleQ1,scaleQ2,
                labelMin,labelMax,labelMed,labelQ25,labelQ75);

        primaryStage.setTitle("Boxplot");
        primaryStage.setScene(new Scene(g, width, 250));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}