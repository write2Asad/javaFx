import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Create VBox
        VBox vbox = new VBox();
        
        // Set spacing between children in VBox
        vbox.setSpacing(10);

        // Set the padding of the VBox
        vbox.setPadding(new Insets(15, 20, 15, 20));

        // Add buttons to VBox
        vbox.getChildren().addAll(btn1, btn2, btn3);

        // Optional: Set the alignment of the VBox
        vbox.setAlignment(Pos.CENTER);

        // Set Scene and Stage
        Scene scene = new Scene(vbox, 200, 150);
        primaryStage.setTitle("VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
