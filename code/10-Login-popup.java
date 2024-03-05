package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
        	  // Create a GridPane layout
            GridPane gridPane = new GridPane();
            gridPane.setAlignment(Pos.CENTER);
            gridPane.setPadding(new Insets(10, 10, 10, 10));
            gridPane.setVgap(5);
            gridPane.setHgap(5);

            // Username Label
            Label usernameLabel = new Label("Username:");
            gridPane.add(usernameLabel, 0, 0);

            // Username TextField
            TextField usernameTextField = new TextField();
            gridPane.add(usernameTextField, 1, 0);

            // Password Label
            Label passwordLabel = new Label("Password:");
            gridPane.add(passwordLabel, 0, 1);

            // PasswordField
            PasswordField passwordField = new PasswordField();
            gridPane.add(passwordField, 1, 1);

            // Login Button
            Button loginButton = new Button("Login");
            gridPane.add(loginButton, 1, 2);
            GridPane.setMargin(loginButton, new Insets(20, 0, 0, 0)); // Add some margin to the top for spacing

            // Action for loginButton
            loginButton.setOnAction(e -> {
                String username = usernameTextField.getText();
                String password = passwordField.getText();

                if ("root".equals(username) && "root".equals(password)) {
                    showAlert(AlertType.INFORMATION, "Login Successful", "Welcome!");
                } else {
                    showAlert(AlertType.ERROR, "Login Failed", "Incorrect username or password.");
                }
            });

            // Set the scene and stage
            Scene scene = new Scene(gridPane, 300, 200);
            primaryStage.setTitle("Login Window");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
