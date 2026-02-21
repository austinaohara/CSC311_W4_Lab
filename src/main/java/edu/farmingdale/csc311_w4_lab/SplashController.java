package edu.farmingdale.csc311_w4_lab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class SplashController {
    @FXML
    private StackPane pane;

    @FXML
    private ImageView imageView;

    @FXML
    public void initialize() {
        imageView.fitWidthProperty().bind(pane.widthProperty());
        imageView.fitHeightProperty().bind(pane.heightProperty());
    }
}
