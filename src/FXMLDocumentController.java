/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author Cristian
 */
public class FXMLDocumentController implements Initializable {
    
    private final String 
            
            TEMA1 = "hojasEstilos/Estilo1.css", 
            TEMA2 = "hojasEstilos/Estilo2.css",
            TEMA3 = "hojasEstilos/Estilo3.css";
    
    @FXML private VBox panel;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @FXML
    private void aplicarEstilo1(ActionEvent event){
        cargarEstilo(TEMA1);
    }
    
    @FXML
    private void aplicarEstilo2(ActionEvent event){
        cargarEstilo(TEMA2);
    }
    
    @FXML
    private void aplicarEstilo3(ActionEvent event){
        cargarEstilo(TEMA3);
    }
    
    @FXML
    private void resetear(ActionEvent event){
        cargarEstilo("");
    }
    
    @FXML
    private void salir(ActionEvent event){
        Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
       
    private void cargarEstilo(String css){
        panel.getStylesheets().removeAll(TEMA1,TEMA2,TEMA3);
        panel.getStylesheets().add(css);
    }
}
