package com.parking.manager.controllers;

import com.github.sarxos.webcam.Webcam;

public class CameraStreamController {

  public void DetectCamera(){
      Webcam webcam = Webcam.getDefault();
      if (webcam != null) {
          System.out.println("Webcam: " + webcam.getName());
      } else {
          System.out.println("No webcam detected");
      }


  }
}
