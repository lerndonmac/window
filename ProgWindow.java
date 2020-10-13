import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ProgWindow extends Application {
    String buf;
    public void start(Stage stage){

        TextField txtText = new TextField();
        txtText.setPrefSize(320,20);
        txtText.setFont(new Font(20));
        txtText.setLayoutY(150);

        var past = new Button("Past");
        past.setLayoutY(200);
        past.setLayoutX(0);
        past.setFont(new Font(20));
        past.setPrefSize(80,20);
        past.setOnAction(event -> {txtText.appendText(buf);});

        var copy = new Button("Copy");
        copy.setLayoutX(80);
        copy.setLayoutY(200);
        copy.setFont( new Font(20));
        copy.setPrefSize(80,20);
        copy.setOnAction(event -> {buf = txtText.getText();});

        var cut = new Button("cut");
        cut.setLayoutY(200);
        cut.setLayoutX(160);
        cut.setPrefSize(60,20);
        cut.setFont( new Font(20));
        cut.setOnAction(event -> {buf = txtText.getText(); txtText.clear();});

        var clear = new Button("clear");
        clear.setLayoutX(220);
        clear.setLayoutY(200);
        clear.setPrefSize(100,20);
        clear.setFont( new Font(20));
        clear.setOnAction(actionEvent -> txtText.clear());

        var close = new Button("close");
        close.setFont(new Font(50));
        close.setPrefSize(320,150);
        close.setOnAction(actionEvent -> stage.close());


        Pane root = new Pane();
        Scene scene = new Scene(root);
        root.getChildren().addAll(past, clear, copy, cut, txtText,close);
        stage.setTitle("MY Window");
        stage.setHeight(720);
        stage.setWidth(1280);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
