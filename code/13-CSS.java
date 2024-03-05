package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {

    
    @Override
    public void start(Stage primaryStage) {
    	// Create a Label and a Button
        Label label = new Label("Hello, JavaFX!");
        Button button = new Button("Click Me!");

        // Create a VBox
        VBox vbox = new VBox(10); // 10 pixels space between components
        vbox.getChildren().addAll(label, button);

        // Load CSS
        Scene scene = new Scene(vbox, 300, 200);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Load the CSS


        primaryStage.setTitle("JavaFX CSS Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
