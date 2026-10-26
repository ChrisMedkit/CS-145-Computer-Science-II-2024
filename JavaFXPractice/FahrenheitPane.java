package application;

import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class FahrenheitPane extends GridPane {
	private Label result;         //pieces that change
	private TextField fahrenheit; //during use
	
	public FahrenheitPane(){
		Font font = new Font(18);//create a font of size 18 pixels
		
		//create the first label, setting font and alignment
		Label inputLabel = new Label("Fahrenheit: ");
		inputLabel.setFont(font);
		GridPane.setHalignment(inputLabel,  HPos.RIGHT);
		//create the second label, setting font and alignment
		Label outputLabel = new Label("Celsius: ");
		outputLabel.setFont(font);
		GridPane.setHalignment(outputLabel, HPos.RIGHT);
		
		result = new Label("---");//initialize output
		result.setFont(font);
		GridPane.setHalignment(result, HPos.CENTER);
		
		fahrenheit = new TextField(); //create empty textbox
		fahrenheit.setFont(font);
		fahrenheit.setPrefWidth(50);
		fahrenheit.setAlignment(Pos.CENTER);
		fahrenheit.setOnAction(this::processReturn);
		
		setAlignment(Pos.CENTER);
		setHgap(20); //horizontal gap between grid elements
		setVgap(10); //vertical gap between grid elements
		setStyle("-fx-background-color: yellow");
		
		//puts pieces to the pane using the position on the grid
		add(inputLabel, 0, 0);
		add(fahrenheit, 1, 0);
		add(outputLabel, 0, 1);
		add(result, 1, 1);		
	}
	
	//Event handler method
	public void processReturn(ActionEvent event){
		int fahrenheitTemp = Integer.parseInt(fahrenheit.getText());
		int celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
		result.setText(celsiusTemp + ""); 
	}
}
