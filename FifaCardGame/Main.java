package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

import java.util.*;

import CardGame.CardsLoader;

public class Main extends Application {
    private ImageView[] cardImages;
    private LinkedList<Cards> deck;
    private TextArea output;
    private List<String> selectablePositions = Arrays.asList("RW", "ST", "LW", "CB", "RB", "LB", "GK");
    private int currentPositionIndex = 0;
    private List<Cards> selectedCards = new ArrayList<>();

    public static void main(String[] args) {
        launch(Main.class, args);
    }

    @Override
    public void start(Stage primaryStage) {
        cardImages = new ImageView[3]; // Array to hold card images

        try {
            deck = CardsLoader.readCardsFromFile();
            if (deck.isEmpty()) {
                showErrorAlert("Error", "No cards loaded from file.");
                System.exit(1);
            }

            primaryStage.setTitle("FIFA Card Picker");

            output = new TextArea();
            output.setEditable(false);
            output.setPrefRowCount(10);
            output.setText("Select 11 cards for your starting lineup.");

            Button draw = new Button("Draw Cards");
            draw.setOnAction(event -> drawCardsForPosition());

            VBox rightBox = new VBox(10, new Text("Selected"), output, draw);
            rightBox.setPadding(new Insets(10));
            rightBox.setAlignment(Pos.TOP_CENTER);

            FlowPane cardPane = new FlowPane();
            cardPane.setStyle("-fx-background-color: white;");
            cardPane.setPrefSize(600, 400);
            cardPane.setAlignment(Pos.CENTER);

            Button[] selectButtons = new Button[3];
            for (int i = 0; i < 3; i++) {
                int index = i;
                cardImages[i] = new ImageView();
                cardImages[i].setFitWidth(200);
                cardImages[i].setPreserveRatio(true);
                cardImages[i].setOnMouseClicked(event -> selectCard(index));

                selectButtons[i] = new Button("Select");
                selectButtons[i].setOnAction(event -> selectCard(index));
            }

            updateCardImages();

            cardPane.getChildren().addAll(cardImages);
            VBox buttonBox = new VBox(10, selectButtons);
            buttonBox.setAlignment(Pos.CENTER);

            BorderPane borderPane = new BorderPane();
            borderPane.setRight(rightBox);
            borderPane.setCenter(cardPane);
            borderPane.setBottom(buttonBox);

            Scene scene = new Scene(borderPane, 1000, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IllegalArgumentException e) {
            showErrorAlert("Error", "Invalid card data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void updateCardImages() {
        if (deck.size() >= 3) {
            List<Cards> cardsForPosition = getCardsForPosition(selectablePositions.get(currentPositionIndex));
            for (int i = 0; i < 3 && i < cardsForPosition.size(); i++) {
                Cards card = cardsForPosition.get(i);
                String imagePath = "AllPlayers/" + card.getImage();
                Image image = new Image(imagePath);
                cardImages[i].setImage(image);
            }
        } else {
            System.out.println("Not enough cards in the deck.");
        }
    }

    private void drawCardsForPosition() {
        if (currentPositionIndex >= selectablePositions.size()) {
            output.setText("All positions selected.");
            return;
        }

        List<Cards> availableCards = getCardsForPosition(selectablePositions.get(currentPositionIndex));

        if (availableCards.isEmpty()) {
            output.appendText("\nNo cards available for " + selectablePositions.get(currentPositionIndex));
            currentPositionIndex++;
            drawCardsForPosition();
            return;
        }

        output.setText("Select a card for position: " + selectablePositions.get(currentPositionIndex));
        updateCardImages();
    }


    private List<Cards> getCardsForPosition(String position) {
        List<Cards> cardsForPosition = new ArrayList<>();
        for (Cards card : deck) {
            if (card.getPosition().equals(position)) {
                cardsForPosition.add(card);
            }
        }
        return cardsForPosition;
    }

    private void selectCard(int index) {
        if (index >= 0 && index < 3) {
            List<Cards> availableCards = getCardsForPosition(selectablePositions.get(currentPositionIndex));
            if (index < availableCards.size()) {
                Cards selectedCard = availableCards.get(index);
                output.setText("Selected Card:\n" + selectedCard.getName() + " - " + selectedCard.getPosition());
                selectedCards.add(selectedCard);

                currentPositionIndex++;
                drawCardsForPosition();
            }
        }
    }

    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
