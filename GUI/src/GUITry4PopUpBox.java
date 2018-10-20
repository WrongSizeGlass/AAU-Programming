import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GUITry4PopUpBox extends Application {
    Button button;
    Stage window;

    public static void display(String title, String message){
        Stage window = new Stage();
        // blocks input events outside of the window
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("close window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }


    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("hello world");


        button = new Button("Click Me");
        button.setOnAction(e -> GUITry4PopUpBox.display("title of window", "wow the alert box is nice XD"));




        StackPane layout = new StackPane();// places the button in the middle

        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

}
