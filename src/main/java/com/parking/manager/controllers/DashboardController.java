package com.parking.manager.controllers;

import com.parking.manager.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
//import com.github.sarxos.webcam.Webcam;


import java.io.IOException;

public class DashboardController {

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;

    @FXML Pane mainPane;

    public void GetCameraStream(ActionEvent event){
        try {
            Pane cameraStreamPane =  FXMLLoader.load(App.class.getResource("views/cameraStream.fxml"));

            mainPane.getChildren().add(cameraStreamPane);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }







}
