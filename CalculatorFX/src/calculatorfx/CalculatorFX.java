/*
 * Normal calculator
 * 2/3/2018
 */
package calculatorfx;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Chayti Saha
 */
public class CalculatorFX extends Application {
    
    private Stage stage;
    private double decorationWidth;
    private double decorationHeight;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        this.stage = stage;
        final double initialSceneWidth = 250;
        final double initialSceneHeight = 270;
        primaryStage.setResizable(false);
        
        final Parent root=FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root, initialSceneWidth, initialSceneHeight);
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        this.decorationWidth = initialSceneWidth - scene.getWidth();
        this.decorationHeight = initialSceneHeight - scene.getHeight();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
