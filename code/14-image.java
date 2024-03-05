package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    
    @Override
    public void start(Stage primaryStage) {
    	   // Load the image
        Image image = new Image(getClass().getResourceAsStream("/logo-beds.png"));
        // Image logoImage = new Image("beds-logo.png");
        // Create an ImageView with the image
        ImageView imageView = new ImageView(image);

        // Optional: adjust the ImageView properties
        imageView.setFitWidth(200); // Set the width of the image
        imageView.setPreserveRatio(true); // Preserve the ratio

        // Add the ImageView to a layout component
        StackPane root = new StackPane(imageView); // Using StackPane for simplicity

        // Create the Scene and show on the Stage
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Image Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
