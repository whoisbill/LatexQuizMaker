package app;
import java.io.IOException;
import java.util.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args){
       launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/app.fxml"));
            Scene primaryScene = new Scene(root);
            primaryStage.setScene(primaryScene);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Scioly to Latex");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
