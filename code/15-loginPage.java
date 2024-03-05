package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.HPos;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Main extends Application {

    
    @Override
    public void start(Stage primaryStage) {
    	 // Logo part
        Image logoImage = new Image("logo-beds.png"); // Update the path to your logo image here
        ImageView logoView = new ImageView(logoImage);
        logoView.setPreserveRatio(true);
        logoView.setFitHeight(200); // Adjust the size as needed
        VBox logoBox = new VBox(logoView);
        logoBox.setAlignment(Pos.CENTER);

        // Login form part
        Label usernameLabel = new Label("Username:");
        TextField usernameTextField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        
        
        // Login Button event handler
        loginButton.setOnAction(event -> {
            String username = usernameTextField.getText();
            String password = passwordField.getText();

            // Hardcoded username and password
            String correctUsername = "root";
            String correctPassword = "root";

            Alert alert = new Alert(AlertType.INFORMATION);
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                // Success case
                alert.setTitle("Login Success");
                alert.setHeaderText(null);
                alert.setContentText("Welcome, you have successfully logged in!");
            } else {
                // Failure case
                alert.setTitle("Login Failed");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect username or password.");
            }

            alert.showAndWait();
        });


        GridPane loginForm = new GridPane();
        loginForm.setAlignment(Pos.CENTER);
        loginForm.setHgap(10);
        loginForm.setVgap(10);
        loginForm.setPadding(new Insets(25, 25, 25, 25));

        loginForm.add(usernameLabel, 0, 0);
        loginForm.add(usernameTextField, 1, 0);
        loginForm.add(passwordLabel, 0, 1);
        loginForm.add(passwordField, 1, 1);
        loginForm.add(loginButton, 1, 2);
        GridPane.setHalignment(loginButton, HPos.RIGHT);

        // Combine logo and login form
        HBox root = new HBox(logoBox, loginForm);
        HBox.setHgrow(logoBox, Priority.ALWAYS);
        HBox.setHgrow(loginForm, Priority.ALWAYS);
        logoBox.setMaxWidth(Double.MAX_VALUE);
        loginForm.setMaxWidth(Double.MAX_VALUE);
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("Login Window with Logo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
