package org.example.cscfeb19lab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Stage loginStage;

    @Override
    public void start(Stage stage) throws IOException {
        loginStage = stage;
        FXMLLoader root1 = new FXMLLoader(HelloApplication.class.getResource("Lab-View_2.fxml"));
        Scene splash = new Scene(root1.load());
        splash.getStylesheets().add(getClass().getResource("Drip.css").toExternalForm());
        stage.setScene(splash);
        stage.show();
    }



    public void startLogin(Stage stage) throws IOException {
        FXMLLoader root2 = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        Scene loginScene = new Scene(root2.load());
        loginScene.getStylesheets().add(getClass().getResource("Drip.css").toExternalForm());
        loginStage.setScene(loginScene);
    }





    public static void main(String[] args) {
        launch();
    }
}