import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Create HBox
        HBox hbox = new HBox();
        
        // Set spacing between children in HBox
        hbox.setSpacing(10);

        // Set the padding of the HBox
        hbox.setPadding(new Insets(15, 12, 15, 12));

        // Add buttons to HBox
        hbox.getChildren().addAll(btn1, btn2, btn3);

        // Optional: Set the alignment of the HBox
        hbox.setAlignment(Pos.CENTER);

        // Set Scene and Stage
        Scene scene = new Scene(hbox, 320, 100);
        primaryStage.setTitle("HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
