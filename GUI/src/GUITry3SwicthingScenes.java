
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;

import static javafx.application.Application.launch;


public class GUITry3SwicthingScenes extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main (String [] args ){
        launch(args);

    }

    public void start (Stage primaryStage) throws Exception {
        window = primaryStage;
        Label label1 = new Label("welcome the first scene");
        Button button1 = new Button("go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        // Layout 1 - chilren are laid out in vertical column
        VBox layout1 = new VBox(20); //padding?
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);


        //Button 2
        Button button2 = new Button("This scene sucks go back to scene one");
        button2.setOnAction(e -> window.setScene(scene1));


        // Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600,300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();


    }



}
