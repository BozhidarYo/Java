package calculator.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Nice try!");
        label.setText("Calculated?");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}