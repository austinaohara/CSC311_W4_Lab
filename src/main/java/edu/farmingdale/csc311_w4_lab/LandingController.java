package edu.farmingdale.csc311_w4_lab;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LandingController {
    @FXML
    private Button navPrevButton;

    @FXML
    private Button navNextButton;

    @FXML
    public void initialize() {
        navPrevButton.setOnAction(event -> SceneNavigator.goTo(navPrevButton, "login-view.fxml"));
        navNextButton.setOnAction(event -> SceneNavigator.goTo(navNextButton, "splash-view.fxml"));
    }
}
