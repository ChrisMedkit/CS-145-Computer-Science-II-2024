package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BackgroundFill;

public class BorderPaneExample extends Application {
	
	public void start(Stage primaryStage) {
		Label labelTop = new Label("Top");
	    FlowPane paneTop = new FlowPane(labelTop);
		paneTop.setAlignment(Pos.CENTER);
	    paneTop.setStyle("-fx-background-color: black;");
	    

	    Label labelLeft = new Label("Left");
	    Pane paneLeft = new Pane(labelLeft);
	    paneLeft.setStyle("-fx-background-color: lightblue;");
	    
	    
	    Label labelRight = new Label("Right"); 
	       
	    Pane paneRight = new Pane(labelRight);
	    paneRight.setStyle("-fx-background-color: red;");
	    
	    Label labelMiddle = new Label("Center");
	    FlowPane paneCenter = new FlowPane(labelMiddle);
	    paneCenter.setAlignment(Pos.TOP_CENTER);	    
	    paneCenter.setStyle("-fx-background-color: green;");
	    
	    Label labelBottom = new Label("Bottom");
	    FlowPane paneBottom = new FlowPane(labelBottom);	    
	    paneBottom.setStyle("-fx-background-color: yellow;");
	    paneBottom.setAlignment(Pos.CENTER);
	    //messing around and adding extra buttons to flow across the pane  
	    //   for(int i = 1; i<=10; i++)
	    //   	paneBottom.getChildren().add( new Button ("Button"+i) );
 	    
	    BorderPane borderPane = new BorderPane();
	    borderPane.setTop(paneTop);
	    borderPane.setLeft(paneLeft);
	    borderPane.setCenter(paneCenter);
	    borderPane.setRight(paneRight);	    
	    borderPane.setBottom(paneBottom);
	     
		Scene scene = new Scene(borderPane,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
