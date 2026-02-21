package edu.farmingdale.csc311_w4_lab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("splash.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 627, 354);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
