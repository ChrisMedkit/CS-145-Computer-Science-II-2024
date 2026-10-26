package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FahrenheitConverter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new FahrenheitPane(), 300, 150);
		
		primaryStage.setTitle("Fahrenheit Converter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
