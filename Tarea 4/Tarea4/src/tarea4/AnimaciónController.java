/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

import com.sun.glass.ui.Cursor;
import java.awt.MouseInfo;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 *
 * @author hvill
 */
public class AnimaciónController implements Initializable {

    @FXML
    private ImageView pezImageView;
    private Button button;
    @FXML
    private AnchorPane root;
    @FXML
    private Label status;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Path path = new Path();

        path.getElements().add(new MoveTo(0, 0));
        path.getElements().add(new LineTo(550, 0));

        PathTransition pathTransition = new PathTransition();
        pathTransition.setNode(pezImageView);
        pathTransition.setDuration(Duration.seconds(5));

        pathTransition.setPath(path);
        pathTransition.setAutoReverse(true);
        pathTransition.setCycleCount(PathTransition.INDEFINITE);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        pathTransition.play();

    }

    @FXML
    private void burbujas(MouseEvent event) {

        Line line1 = new Line(event.getSceneX(), event.getSceneY(), event.getSceneX(), -30);
        Line line2 = new Line(event.getSceneX()-10, event.getSceneY()-10, event.getSceneX(), -30);
        Line line3 = new Line(event.getSceneX()+10, event.getSceneY()+10, event.getSceneX(), -30);

        //Burbuja 1
        Circle burbuja1 = new Circle(6);
        burbuja1.setStroke(Color.WHITE);
        burbuja1.setFill(Color.LIGHTBLUE);
        root.getChildren().add(burbuja1);
        
        //Burbuja 2
        Circle burbuja2 = new Circle(5.5);
        burbuja2.setStroke(Color.WHITE);
        burbuja2.setFill(Color.LIGHTBLUE);
        root.getChildren().add(burbuja2);
        
        //Burbuja3
        Circle burbuja3 = new Circle(5);
        burbuja3.setStroke(Color.WHITE);
        burbuja3.setFill(Color.LIGHTBLUE);
        root.getChildren().add(burbuja3);
        
        //Burbuja 1
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), burbuja1);
        scaleTransition.setToX(3);
        scaleTransition.setToY(3);
        scaleTransition.play();
        
        //Burbuja 2
        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.seconds(2), burbuja2);
        scaleTransition2.setToX(3);
        scaleTransition2.setToY(3);
        scaleTransition2.play();
        
        //Burbuja 3
        ScaleTransition scaleTransition3 = new ScaleTransition(Duration.seconds(2), burbuja3);
        scaleTransition2.setToX(3);
        scaleTransition2.setToY(3);
        scaleTransition2.play();
        
        
        //Transición de la burbuja
        PathTransition pathTransitionBubble = new PathTransition();
        pathTransitionBubble.setNode(burbuja2);
        pathTransitionBubble.setDuration(Duration.seconds(2));
        pathTransitionBubble.setPath(line1);
        pathTransitionBubble.setRate(0.5);
        pathTransitionBubble.play();
        
        //Transición de la burbuja
        PathTransition pathTransitionBubble2 = new PathTransition();
        pathTransitionBubble2.setNode(burbuja1);
        pathTransitionBubble2.setDuration(Duration.seconds(2));
        pathTransitionBubble2.setPath(line2);
        pathTransitionBubble2.setRate(0.6);
        pathTransitionBubble2.play();
        
        //Transición de la burbuja
        PathTransition pathTransitionBubble3 = new PathTransition();
        pathTransitionBubble3.setNode(burbuja3);
        pathTransitionBubble3.setDuration(Duration.seconds(2));
        pathTransitionBubble3.setPath(line3);
        pathTransitionBubble3.setRate(0.6);
        pathTransitionBubble3.play();

    }

    @FXML
    private void displayPosition(MouseEvent event) {
        status.setText("X = " + event.getX() + "     Y = " + event.getY());
    }
}
