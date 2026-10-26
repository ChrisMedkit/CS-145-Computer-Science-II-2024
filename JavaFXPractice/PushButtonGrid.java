package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PushButtonGrid extends Application {
	Label output;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane pane = new GridPane();
		
		for(int row = 1; row <= 10; row++) {
			for(int col =1; col <=10; col++) {
				Button newButton = new Button("Push "+row+","+col);
				newButton.setOnAction(this::processButtonToLabel);
				pane.add(newButton,col-1, row-1, 1, 1);
			}
		}
		output = new Label("Nothing");
		pane.add(output, 0, 11);
		pane.setAlignment(Pos.CENTER);
		pane.setStyle("-fx-background-color: cornsilk");
		
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("GridPane Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void processButtonToLabel(ActionEvent event){
		System.out.println(((Button)event.getSource()).getText());
		output.setText(  ((Button)event.getSource()).getText()    );
	
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
