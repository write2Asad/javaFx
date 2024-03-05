import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonTextFieldExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a TextField
        TextField textField = new TextField();
        textField.setPromptText("Enter something...");

        // Create a Button
        Button button = new Button("Click Me");
        // button.setText("Click Me");

        // Create a Label for displaying the message
        Label messageLabel = new Label();

        // Set an action handler for the button
        button.setOnAction(event -> {
            String inputText = textField.getText(); // Get text from the TextField
            messageLabel.setText("You entered: " + inputText); // Display text in the Label
        });

        // Layout
        VBox layout = new VBox(10); // 10 pixels space between components
        layout.getChildren().addAll(textField, button, messageLabel);

        // Scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
