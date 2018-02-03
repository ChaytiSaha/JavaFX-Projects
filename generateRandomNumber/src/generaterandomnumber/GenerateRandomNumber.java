/*
 * This is my first project in JavaFX for Generating Integer Numbers
 */
package generaterandomnumber;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Chayti Saha
 */
public class GenerateRandomNumber extends Application {
    
    private Stage stage;
    private double decorationWidth;
    private double decorationHeight;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        this.stage = stage;
        final double initialSceneWidth = 500;
        final double initialSceneHeight = 300;
        
        primaryStage.setResizable(false);//setResizable() method allows to set the value of the property resizable
        final Parent root=FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root, initialSceneWidth, initialSceneHeight);
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.setTitle("Generating Random Numbers");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        this.decorationWidth = initialSceneWidth - scene.getWidth();
        this.decorationHeight = initialSceneHeight - scene.getHeight();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
