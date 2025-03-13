package com.mycompany.helloworldjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class PrimaryController{

    @FXML
    private Label lblMsg;
    @FXML
    private Button btnClick;
    @FXML
    private Button btnPress;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void clicouBotao(ActionEvent event){
        lblMsg.setText("Hello,World!");
    }

    @FXML
    private void clickButton(ActionEvent event){

        lblMsg.setText("aaaaa");

    }
}
