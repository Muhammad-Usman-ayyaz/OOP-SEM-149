package com.example.demo1;

import javafx.application.Application;
import javafx.stage.Stage;

;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        SceneManager.init(primaryStage);
        SceneManager.showMainMenu();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
