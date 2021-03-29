package com.parking.manager.controllers;

import java.io.IOException;
import com.parking.manager.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class  LoginPageController {
    @FXML
    private Button loginButton;
    @FXML
    ImageView imageAvatar;

    public Button getLoginButton() {
        return loginButton;
    }

    public void connectClick(){
        try {
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();

            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("dashboard" + ".fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            //jMetro.setScene(scene);
            Stage dashboard=new Stage();
            dashboard.setScene(scene);
            dashboard.setTitle("Parking Manager");



            dashboard.show();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
