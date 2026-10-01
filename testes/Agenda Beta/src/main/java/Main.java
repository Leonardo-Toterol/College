import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Pane pane = new Pane();

        Scene scene = new Scene(pane, 800, 600);

        stage.setScene(scene);

        stage.show();

    }
}