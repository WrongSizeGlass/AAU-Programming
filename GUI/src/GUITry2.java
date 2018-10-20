import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class GUITry2 extends Application  {
    Button button;


    public static void main (String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("title of the window");

        button = new Button();
        button.setText("Try this out");
        button.setOnAction(e -> { // or // System.out.println("Lambda Expression1 text"));
              System.out.println("Lambda Expression2 text");
                });
        StackPane layout = new StackPane();// places the button in the middle

        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    }
