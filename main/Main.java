package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        loadImages();
        primaryStage.setTitle("Portfolio");
        primaryStage.getIcons().add(new Image("img/icon.png"));
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void loadImages() {
        for(int i=1;i<=5;i++) {
            Controller.morzeList.add(new Image("img/morze/" + i + ".jpg"));
            Controller.goryList.add(new Image("img/gory/" + i + ".jpg"));
            Controller.stolicaList.add(new Image("img/stolica/" + i + ".jpg"));
            Controller.biwakList.add(new Image("img/biwak/" + i + ".jpg"));
            Controller.namiotyList.add(new Image("img/namioty/" + i + ".jpg"));
        }
    }
}