import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animation extends Application {
    @Override
    public void start(Stage stage) {
        // sphere
        Sphere sphere = new Sphere(100);
        PhongMaterial sphereMat = new PhongMaterial();
        sphereMat.setDiffuseColor(Color.LIGHTCORAL);
        sphere.setMaterial(sphereMat);

        BorderPane paneSphere = new BorderPane();
        paneSphere.setMinSize(300, 300);
        paneSphere.setCenter(sphere);

        // cylinder
        Cylinder cylinder = new Cylinder(100, 200);
        PhongMaterial cylinderMat = new PhongMaterial();
        cylinderMat.setDiffuseColor(Color.LIGHTSALMON);
        cylinder.setMaterial(cylinderMat);

        BorderPane paneCylinder = new BorderPane();
        paneCylinder.setMinSize(300, 300);
        paneCylinder.setCenter(cylinder);

        //box
        Box box = new Box(200, 200, 200);
        PhongMaterial boxMat = new PhongMaterial();
        boxMat.setDiffuseColor(Color.LIGHTSALMON);
        box.setMaterial(boxMat);
        BorderPane paneBox = new BorderPane();
        paneBox.setMinSize(300, 300);
        paneBox.setCenter(box);

        // polygon
        Polygon polygon = new Polygon(400.0, 300.0,
                350.0, 300.0,
                400.0, 200.0,
                350.0, 100.0,
                200.0, 100.0,
                150.0, 200.0,
                200.0, 300.0);
        BorderPane panePolygon = new BorderPane();
        polygon.setFill(Color.LIGHTCORAL);
        panePolygon.setMinSize(300, 300);
        panePolygon.setCenter(polygon);

        // menu 1
        GridPane btnPane1 = new GridPane();
        List<Node> shapes1 = new ArrayList<>(Arrays.asList(sphere, cylinder));

        for (int i = 0; i < shapes1.size(); i++) {
            ChoiceBox<String> transition1 = new ChoiceBox<>();
            DropShadow shadow = new DropShadow();
            transition1.setEffect(shadow);
            transition1.getItems().addAll("Rotate", "Scale", "Sequential");
            int j = i;
            EventHandler<ActionEvent> handler = actionEvent -> {
                RotateTransition rotate = new RotateTransition(Duration.millis(3000), shapes1.get(j));
                rotate.setNode(shapes1.get(j));
                rotate.setAxis(Rotate.X_AXIS);
                rotate.setByAngle(180);
                rotate.setAutoReverse(true);
                rotate.setCycleCount(2);

                ScaleTransition scale = new ScaleTransition(Duration.millis(3000), shapes1.get(j));
                scale.setByX(0.5);
                scale.setByY(0.5);
                scale.setAutoReverse(true);
                scale.setCycleCount(2);

                switch (transition1.getValue()) {
                    case "Rotate":
                        rotate.play();
                        break;
                    case "Scale":
                        scale.setAutoReverse(true);
                        scale.play();
                        break;
                    case "Sequential":
                        SequentialTransition seq = new SequentialTransition(shapes1.get(j), rotate, scale);
                        seq.play();
                        break;
                }
            };
            transition1.setOnAction(handler);
            btnPane1.add(transition1, i % 2, i / 2);
        }

        // menu 2
        GridPane btnPane2 = new GridPane();
        List<Node> shapes2 = new ArrayList<>(Arrays.asList(box, polygon));

        for (int i = 0; i < shapes2.size(); i++) {
            ChoiceBox<String> transition2 = new ChoiceBox<>();
            DropShadow shadow = new DropShadow();
            transition2.setEffect(shadow);
            if (i == 0) transition2.getItems().addAll("Rotate", "Scale", "Sequential");
            else transition2.getItems().addAll("Rotate", "Scale", "Sequential", "Fade");

            int j = i;
            EventHandler<ActionEvent> handler = actionEvent -> {
                RotateTransition rotate = new RotateTransition(Duration.millis(3000), shapes2.get(j));
                rotate.setNode(shapes2.get(j));
                rotate.setAxis(Rotate.X_AXIS);
                rotate.setByAngle(180);
                rotate.setAutoReverse(true);
                rotate.setCycleCount(2);

                ScaleTransition scale = new ScaleTransition(Duration.millis(3000), shapes2.get(j));
                scale.setByX(.5);
                scale.setByY(.5);
                scale.setAutoReverse(true);
                scale.setCycleCount(2);

                switch (transition2.getValue()) {
                    case "Rotate":
                        rotate.play();
                        break;
                    case "Scale":
                        scale.play();
                        break;
                    case "Sequential":
                        SequentialTransition seq = new SequentialTransition(shapes2.get(j), rotate, scale);
                        seq.play();
                        break;
                    case "Fade":
                        FadeTransition fade = new FadeTransition(Duration.millis(3000), shapes2.get(j));
                        fade.setFromValue(1.0);
                        fade.setToValue(0.1);
                        fade.setAutoReverse(true);
                        fade.setCycleCount(2);
                        fade.play();
                        break;
                }
            };
            transition2.setOnAction(handler);
            btnPane2.add(transition2, i % 2, i / 2);
        }

        GridPane root = new GridPane();
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setHgap(50);
        root.setVgap(50);
        root.addRow(0, paneSphere, paneCylinder);
        root.addRow(1, btnPane1.getChildren().get(0), btnPane1.getChildren().get(1));
        root.addRow(2, paneBox, panePolygon);
        root.addRow(3, btnPane2.getChildren().get(0), btnPane2.getChildren().get(1));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Shapes Animation");
        stage.setMinHeight(600);
        stage.setMinWidth(600);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

