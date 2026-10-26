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

public class PushCounter extends Application {
	private int count;
	private Text countText;
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		count = 0;
		countText = new Text("Pushes: 0");
		
		Button push = new Button("Push Me!");
		
		push.setOnAction(this::processButtonPress);//this goes with the processButtonPress method
		
		//push.setOnAction(new ButtonHandler());  //this goes with the private inner class ButtonHandler
		
		/*
		 * push.setOnAction((event) -> { 
		 * 		count++; 								//this approach defines the listener and connects it at the same time.
		 * 		countText.setText("Pushes: " + count);  // it can only be done with functional interfaces (those containing a single method)
		 * });
		 */
		
		FlowPane pane = new FlowPane(push, countText);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: cornsilk");
		
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Push Counter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/*
	 * private class ButtonHandler implements EventHandler<ActionEvent> { 
	 * 		public void handle(ActionEvent event){ 
	 * 			count++; 
	 * 			countText.setText("Pushes: "+ count); 
	 * 		}
	 * } 
	 */
	
	
	  public void processButtonPress(ActionEvent event){ 
		  count++;
		  countText.setText("Pushes: "+ count); 
	  }
	 
	public static void main(String[] args) {
		launch(args);
	}
	
}
