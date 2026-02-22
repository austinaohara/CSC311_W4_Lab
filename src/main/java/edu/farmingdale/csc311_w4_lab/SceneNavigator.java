package edu.farmingdale.csc311_w4_lab;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public final class SceneNavigator {
    private static final double DEFAULT_WIDTH = 400;
    private static final double DEFAULT_HEIGHT = 250;

    private SceneNavigator() {
    }

    public static void goTo(Node source, String viewFileName) {
        try {
            FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource(viewFileName));
            Parent root = loader.load();

            Scene currentScene = source.getScene();
            double width = currentScene == null ? DEFAULT_WIDTH : currentScene.getWidth();
            double height = currentScene == null ? DEFAULT_HEIGHT : currentScene.getHeight();

            Scene nextScene = new Scene(root, width, height);
            nextScene.getStylesheets().add(MainApplication.class.getResource("styles.css").toExternalForm());

            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(nextScene);
        } catch (IOException e) {
            throw new RuntimeException("Unable to load scene: " + viewFileName, e);
        }
    }
}
