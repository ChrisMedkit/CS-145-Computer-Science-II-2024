package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.scene.Scene;

public class RedOrBlue extends Application {
	private Button redButton, blueButton;
	private FlowPane pane;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		redButton = new Button("Red!");
		redButton.setOnAction(this::processColorButton);
		
		blueButton = new Button("Blue!");
		blueButton.setOnAction(this::processColorButton);
		
		pane = new FlowPane(redButton, blueButton);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: white");
		
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Red or Blue?");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void processColorButton(ActionEvent event){
		if (event.getSource() == redButton)
			pane.setStyle("-fx-background-color: crimson");
		if (event.getSource() == blueButton)
			pane.setStyle("-fx-background-color: deepskyblue");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
