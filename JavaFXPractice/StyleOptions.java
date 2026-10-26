package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StyleOptions extends Application {
	public void start(Stage primaryStage) throws Exception {
		StyleOptionsPane pane = new StyleOptionsPane();
		pane.setAlignment(Pos.CENTER);
		pane.setStyle("-fx-background-color: skyblue");
		Scene scene = new Scene(pane, 400, 150);
		primaryStage.setTitle("StyleOpeions");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
