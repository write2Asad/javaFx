package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
        	 // Create a GridPane
            GridPane gridPane = new GridPane();
            
            // Set padding and spacing
            gridPane.setPadding(new Insets(10, 10, 10, 10));
            gridPane.setVgap(5);
            gridPane.setHgap(5);

            // Create Labels
            Label nameLabel = new Label("Name:");
            Label emailLabel = new Label("Email:");

            // Create TextFields
            TextField nameTextField = new TextField();
            TextField emailTextField = new TextField();

            // Create Button
            Button submitButton = new Button("Submit");

            // Add components to the GridPane
            gridPane.add(nameLabel, 0, 0); // Column=0, Row=0
            gridPane.add(nameTextField, 1, 0); // Column=1, Row=0
            gridPane.add(emailLabel, 0, 1); // Column=0, Row=1
            gridPane.add(emailTextField, 1, 1); // Column=1, Row=1
            gridPane.add(submitButton, 1, 2); // Column=1, Row=2
            GridPane.setHalignment(submitButton, HPos.RIGHT); // Right align the submit button

            // Setting an action for the Submit button
            submitButton.setOnAction(e -> {
                System.out.println("Name: " + nameTextField.getText());
                System.out.println("Email: " + emailTextField.getText());
            });

            // Creating the Scene
            Scene scene = new Scene(gridPane, 300, 150);
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX GridPane Example");
            primaryStage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
