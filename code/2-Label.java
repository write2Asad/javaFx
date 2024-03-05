package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
        	Label label = new Label("Hello, JavaFX!");
            StackPane stackPane = new StackPane();
            stackPane.getChildren().add(label); // Add the label to the StackPane
        	
        	
        	Scene scene = new Scene(stackPane, 600, 400);
            primaryStage.setTitle("University of Bedfordshire");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
