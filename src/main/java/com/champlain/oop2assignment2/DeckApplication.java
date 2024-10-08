package com.champlain.oop2assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DeckApplication extends Application {
    @Override
    public void start(Stage pStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DeckApplication.class.getResource("deck-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        pStage.setTitle("Hello!");
        pStage.setScene(scene);
        pStage.show();
    }

    public static void main(String[] pArgs) {
        launch();
    }
}