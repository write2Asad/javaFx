import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Rectangle
        Rectangle rectangle = new Rectangle(200, 100);
        rectangle.setFill(Color.LIGHTBLUE);

        // Create a Circle
        Circle circle = new Circle(50);
        circle.setFill(Color.LIGHTGREEN);

        // Create a Label
        Label label = new Label("StackPane Example");

        // Create a StackPane and add the rectangle, circle, and label to it
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(rectangle, circle, label);

        // Creating the Scene
        Scene scene = new Scene(stackPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX StackPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
