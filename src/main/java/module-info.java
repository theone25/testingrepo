module com.parking.manager {
    requires javafx.controls;
    requires javafx.fxml;
	requires webcam.capture;
	
	 opens com.parking.manager.controllers to javafx.fxml;
	   exports com.parking.manager.controllers;

    opens com.parking.manager to javafx.fxml;
    exports com.parking.manager;
}