package application;
	
import java.awt.TextField;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class AddToBorderPaneApp extends Application {
	@Override
	public void start(Stage primaryStage) {
		private TextArea output;
		private Button order;
		private ChoiceBox<String>choiceBox;
		private ToggleGroup toggleGroup;
		private TextField name;
		Arraylist <CheckBox> list CheckBoxes = new ArrayList<CheckBox>();
		try {
			//BorderPane root = new BorderPane();
			Text hello = new Text (50,50, "Hello, JavaFX@");
			Text question = new Text(120,80, "How's it going?");
			Group root = new Group (hello,question);
			
			Scene scene = new Scene(root,400,400, Color.MAGENTA);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
