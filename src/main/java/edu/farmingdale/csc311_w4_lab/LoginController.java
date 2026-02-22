package edu.farmingdale.csc311_w4_lab;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginController {
    @FXML
    private Button navPrevButton;

    @FXML
    private Button navNextButton;

    @FXML
    public void initialize() {
        navPrevButton.setOnAction(event -> SceneNavigator.goTo(navPrevButton, "splash-view.fxml"));
        navNextButton.setOnAction(event -> SceneNavigator.goTo(navNextButton, "landing-view.fxml"));
    }
}
