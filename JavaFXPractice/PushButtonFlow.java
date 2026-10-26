package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PushButtonFlow extends Application {
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FlowPane pane = new FlowPane();
		
		for(int i = 1; i<= 10; i++) {
			pane.getChildren().add(new Button("Push "+i));
		}
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5);
		pane.setVgap(5);
		pane.setStyle("-fx-background-color: cornsilk");
		
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Push Buttons");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
