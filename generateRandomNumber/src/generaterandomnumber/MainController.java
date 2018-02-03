
package generaterandomnumber;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

public class MainController implements Initializable {
    @FXML
    private Label myMessage;
    public void generateRandom(ActionEvent event){
        Random rand = new Random();
        int myrand = rand.nextInt(50)+1;
        myMessage.setText(Integer.toString(myrand));
    }
    public void exit(ActionEvent event){
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
