package org.example.cscfeb19lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Slider slider;

    Stage splashStage;

    HelloApplication loginScreen = new HelloApplication();


    @FXML
    public void MySliderClicked(MouseEvent event) {
        if(event.getSource() == slider) {
            splashStage = (Stage) slider.getScene().getWindow();
        }
        try{
            loginScreen.startLogin(splashStage);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}



