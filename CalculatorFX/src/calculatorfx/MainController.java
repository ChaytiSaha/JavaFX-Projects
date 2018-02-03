package calculatorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class MainController implements Initializable {

    @FXML
    private Label result , result1;
    private double number1 = 0, number2=0;
    private String operator = "";
    private boolean start = true;
    private Model model = new Model();
    
    @FXML
    public void processNumbers(ActionEvent event){
        if(start){
            result.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText() + value);
        show(value);
    }
    
    @FXML
    public void processOperators(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        
        if(!value.equals("=")){
            if(!operator.isEmpty())
                return;
            
            show(value);
            
            operator = value;
            number1 =Double.parseDouble(result.getText());
            result.setText("");
        }else{
            if(operator.isEmpty())
                return;
            
            double number2 = Double.parseDouble(result.getText());
            double output = model.calculate(number1, number2, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;  
        }
    }
    
    @FXML
    public void show(String value){
        result1.setText(result1.getText()+value);//for showing all of inputs which user provide ... like 22/11
    }
    
    @FXML
    public void reset(ActionEvent event){
        result.setText("");
        result1.setText("");
        start = true;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
