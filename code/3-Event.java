package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
        	  // Create a button and set its text
	        Button btn = new Button();
	        btn.setText("Say 'Hello, Students!'");

	        // Register an event handler (a lambda expression) for the button
	        btn.setOnAction(event -> System.out.println("Hello, Students!"));
	        
	        btn.setOnAction(event -> {
	            // Create an alert with an INFORMATION type.
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("Message");
	            alert.setHeaderText(null); // No header text
	            alert.setContentText("Hello, Students I am popup!");

	            // Display the alert and wait for it to be closed
	            alert.showAndWait();
	        });

	        // Create a layout and add the button to the layout
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);

	        // Create a scene, specifying the root layout and the dimensions
	        Scene scene = new Scene(root, 300, 250);

	        // Set the scene on the stage, set a title, and show the stage
	        primaryStage.setTitle("Hello World!");
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
